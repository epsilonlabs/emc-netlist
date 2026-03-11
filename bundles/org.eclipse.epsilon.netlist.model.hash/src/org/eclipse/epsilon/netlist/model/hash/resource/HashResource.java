package org.eclipse.epsilon.netlist.model.hash.resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.epsilon.netlist.model.hash.CircuitBlock;
import org.eclipse.epsilon.netlist.model.hash.CircuitBlockInstance;
import org.eclipse.epsilon.netlist.model.hash.ComponentType;
import org.eclipse.epsilon.netlist.model.hash.HashFactory;
import org.eclipse.epsilon.netlist.model.hash.HashModel;

public class HashResource extends ResourceImpl {

	private static final Pattern RE_WHITESPACE = Pattern.compile("\\s+");

	private static final String GRP_COMPONENT = "component";
	private static final String GRP_INSTANCE = "instance";
	private static final Pattern RE_COMPONENT_NAME = Pattern.compile(String.format(
		"(?<%s>[^0-9]+\\d+)(?<%s>[^0-9]+\\d*)?",
		GRP_COMPONENT, GRP_INSTANCE
	));

	/*
	 * We assume that CCB names start with 3 letters or more, whereas basic
	 * components start with 1-2 letters only.
	 */
	private static final Pattern RE_CCB_NAME = Pattern.compile("^[^0-9]{3,}");

	protected static class ComponentLine {
		String componentInstanceNames, partNumber, ccbPinNames;
	}

	protected class HashResourceLoader {
		private Map<String, ComponentType> componentTypes = new HashMap<>();
		private ComponentType currentComponentType;

		private Map<String, CircuitBlock> ccbs = new HashMap<>();
		private Map<String, CircuitBlockInstance> ccbInstances = new HashMap<>();

		private int currentLine;
		private HashModel m = HashFactory.eINSTANCE.createHashModel();

		public void processLine(int lineNumber, String line) {
			currentLine = lineNumber;

			if (line.startsWith(";")) {
				// ignore for now - file-level comment at top
			} else if (line.startsWith("#")) {
				// #CAT line (indicating category)
				processComponentType(line.substring(1));
			} else {
				String[] parts = RE_WHITESPACE.split(line);
				if (parts.length != 3) {
					throw new IllegalArgumentException(String.format(
						"Line %d: '%s' does not have the expected 3 parts (has %s instead)",
						currentLine, line, Arrays.toString(parts)
					));
				}

				var cl = new ComponentLine();
				cl.componentInstanceNames = parts[0];
				cl.partNumber = parts[1];
				cl.ccbPinNames = parts[2];
				processComponent(cl);
			}
		}

		protected void processComponentType(String type) {
			currentComponentType = componentTypes.get(type);

			if (currentComponentType == null) {
				currentComponentType = HashFactory.eINSTANCE.createComponentType();
				currentComponentType.setName(type);
				componentTypes.put(type, currentComponentType);
				m.getComponentTypes().add(currentComponentType);
			}
		}

		protected void processComponent(ComponentLine cl) {
			Matcher mName = RE_COMPONENT_NAME.matcher(cl.componentInstanceNames);
			if (!mName.matches()) {
				throw new IllegalArgumentException(String.format(
					"Line %d: Component name '%s' does not follow regex '%s'",
					currentLine, cl.componentInstanceNames, RE_COMPONENT_NAME
				));
			}
			String componentName = mName.group(GRP_COMPONENT);
			String instanceName = mName.group(GRP_INSTANCE);
			if (instanceName == null) {
				// Default "unknown" instance
				instanceName = "?";
			}

			String[] ccbPinParts = cl.ccbPinNames.split("[.]");
			String ccbName;
			String componentCcbName;
			if (ccbPinParts.length > 2) {
				throw new IllegalArgumentException(String.format(
					"Line %d: CCB.Pin column '%s' has more than 2 parts",
					currentLine, cl.ccbPinNames
				));
			} else if (ccbPinParts.length == 1) {
				// Third column is '?' (not in a CCB?)
				ccbName = ccbPinParts[0];
				componentCcbName = componentName;
			} else if (ccbPinParts.length == 2) {
				/*
				 * We first try to find which of the two sides is the CCB by comparing against
				 * the known component name.
				 */
				if (componentName.equals(ccbPinParts[0])) {
					ccbName = ccbPinParts[1];
					componentCcbName = ccbPinParts[0];
				} else if (componentName.equals(ccbPinParts[1])) {
					ccbName = ccbPinParts[0];
					componentCcbName = ccbPinParts[1];
				} else if (isCCBName(ccbPinParts[0])) {
					ccbName = ccbPinParts[0];
					componentCcbName = ccbPinParts[1];
				} else if (isCCBName(ccbPinParts[1])) {
					ccbName = ccbPinParts[1];
					componentCcbName = ccbPinParts[0];
				} else {
					throw new IllegalArgumentException(String.format(
						"Line %d: Could not find component name '%s' on the CCB.Pin column '%s'",
						currentLine, componentName, cl.ccbPinNames
					));
				}
			} else {
				throw new IllegalArgumentException(String.format(
					"Line %d: CCB.Pin column '%s' has 0 parts",
					currentLine, cl.ccbPinNames
				));
			}

			var c = HashFactory.eINSTANCE.createComponent();
			c.setCircuitName(cl.componentInstanceNames);
			c.setBlockName(componentCcbName);
			c.setPartNumber(cl.partNumber);
			c.setType(currentComponentType);

			var ccbInstance = getCircuitBlockInstance(ccbName, instanceName);
			ccbInstance.getComponents().add(c);
		}

		protected boolean isCCBName(String name) {
			return RE_CCB_NAME.matcher(name).find();
		}

		protected CircuitBlockInstance getCircuitBlockInstance(String ccbName, String instanceName) {
			CircuitBlock ccb = ccbs.get(ccbName);
			if (ccb == null) {
				ccb = HashFactory.eINSTANCE.createCircuitBlock();
				ccb.setName(ccbName);
				m.getCircuitBlocks().add(ccb);
				ccbs.put(ccbName, ccb);
			}
	
			String instanceKey = ccbName + "." + instanceName;
			CircuitBlockInstance instance = ccbInstances.get(instanceKey);
			if (instance == null) {
				instance = HashFactory.eINSTANCE.createCircuitBlockInstance();
				instance.setName(instanceName);
				ccb.getInstances().add(instance);
				ccbInstances.put(instanceKey, instance);
			}

			return instance;
		}

		public HashModel getModel() {
			return m;
		}
	}

	public HashResource(URI uri) {
		super(uri);
	}


	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		try (InputStreamReader isr = new InputStreamReader(inputStream); BufferedReader br = new BufferedReader(isr)) {
			HashResourceLoader loader = new HashResourceLoader();

			int lineNumber = 0;
			String line;
			while ((line = br.readLine()) != null) {
				++lineNumber;
				line = line.strip();
				if (line.isEmpty()) continue;
				loader.processLine(lineNumber, line);
			}

			getContents().clear();
			getContents().add(loader.getModel());
		}
	}
	
}
