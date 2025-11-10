package org.eclipse.epsilon.emc.netlist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import org.apache.commons.collections.collection.UnmodifiableCollection;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolEnumerationValueNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.exceptions.models.EolNotInstantiableModelElementTypeException;
import org.eclipse.epsilon.eol.models.CachedModel;

public class ConciseNetlistModel extends CachedModel<ModelElement> {

	private static final String FILE_HEADER = "CONCISE NET LIST - 1";
	private static final String FILE_FOOTER = "END CONCISE NET LIST";

	private static final String ID_PREFIX_NET = "n-";
	private static final String ID_PREFIX_COMPONENT = "c-";

	private static final String TYPE_NET = "Net";
	private static final String TYPE_COMPONENT = "Component";
	private static final Set<String> ALL_TYPES = Set.of(TYPE_NET, TYPE_COMPONENT);

	private File modelFile;
	private Map<String, Net> nets;
	private Map<String, Component> components;

	@Override
	public Object getEnumerationValue(String enumeration, String label) throws EolEnumerationValueNotFoundException {
		throw new UnsupportedOperationException("Model does not support enums");
	}

	@Override
	public String getTypeNameOf(Object instance) {
		return instance.getClass().getSimpleName();
	}

	@Override
	public Object getElementById(String id) {
		if (id.startsWith(ID_PREFIX_NET)) {
			return nets.get(id.substring(ID_PREFIX_NET.length()));
		} else if (id.startsWith(ID_PREFIX_COMPONENT)) {
			return components.get(id.substring(ID_PREFIX_COMPONENT.length()));
		} else {
			return null;
		}
	}

	@Override
	public String getElementId(Object instance) {
		if (instance instanceof Net net) {
			return ID_PREFIX_NET + net.getName();
		} else if (instance instanceof Component component) {
			return ID_PREFIX_COMPONENT + component.getName();
		} else {
			return null;
		}
	}

	@Override
	public void setElementId(Object instance, String newId) {
		throw new UnsupportedOperationException("IDs cannot be modified on this model");
	}

	@Override
	public boolean owns(Object instance) {
		if (instance instanceof ModelElement m) {
			return m.getModel() == this;
		}
		return false;
	}

	@Override
	public boolean isInstantiable(String type) {
		// model is readonly
		return false;
	}

	@Override
	public boolean hasType(String type) {
		return ALL_TYPES.contains(type);
	}

	@Override
	public boolean store(String location) {
		throw new UnsupportedOperationException("Model is read-only");
	}

	@Override
	public boolean store() {
		throw new UnsupportedOperationException("Model is read-only");
	}

	@Override
	protected Collection<ModelElement> allContentsFromModel() {
		var allContents = new ArrayList<ModelElement>();
		allContents.addAll(nets.values());
		allContents.addAll(components.values());
		return allContents;
	}

	@Override
	protected Collection<ModelElement> getAllOfTypeFromModel(String type) throws EolModelElementTypeNotFoundException {
		return getAllOfKindFromModel(type);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Collection<ModelElement> getAllOfKindFromModel(String kind) throws EolModelElementTypeNotFoundException {
		if (TYPE_NET.equals(kind)) {
			return UnmodifiableCollection.decorate(nets.values());
		} else if (TYPE_COMPONENT.equals(kind)) {
			return UnmodifiableCollection.decorate(components.values());
		} else {
			throw new EolModelElementTypeNotFoundException(this.getName(), kind);
		}
	}

	@Override
	protected ModelElement createInstanceInModel(String type)
			throws EolModelElementTypeNotFoundException, EolNotInstantiableModelElementTypeException {
		throw new UnsupportedOperationException("Model is read-only");
	}

	@Override
	protected void loadModel() throws EolModelLoadingException {
		if (modelFile == null) {
			throw new IllegalStateException("Model file has not been set");
		}

		try (FileReader fr = new FileReader(modelFile); BufferedReader br = new BufferedReader(fr)) {
			final String firstLine = br.readLine();
			if (firstLine == null && !FILE_HEADER.equals(firstLine)) {
				throw new IllegalStateException("File is not a concise net list in v1 format");
			}

			this.nets = new HashMap<>();
			this.components = new HashMap<>();

			String line;
			while ((line = br.readLine()) != null && !FILE_FOOTER.equals(line)) {
				var st = new StringTokenizer(line);

				// Split line into parts
				String netName = st.nextToken();
				String componentName = st.nextToken();
				int pinNumber = Integer.parseInt(st.nextToken());
				String[] componentFeatures = st.nextToken().split(",");

				Net net = nets.computeIfAbsent(netName, k -> new Net(this, k));
				Component component = components.computeIfAbsent(componentName, k -> new Component(this, k));
				component.setPin(pinNumber, net);
				component.setFeatures(Set.of(componentFeatures));
			}
		} catch (Exception e) {
			throw new EolModelLoadingException(e, this);
		}
	}

	@Override
	protected void disposeModel() {
		this.nets = null;
		this.components = null;
	}

	@Override
	protected boolean deleteElementInModel(Object instance) throws EolRuntimeException {
		throw new UnsupportedOperationException("Model is read-only");
	}

	@Override
	protected Object getCacheKeyForType(String type) throws EolModelElementTypeNotFoundException {
		return type;
	}

	@Override
	protected Collection<String> getAllTypeNamesOf(Object instance) {
		return List.of(instance.getClass().getSimpleName());
	}

	public File getModelFile() {
		return modelFile;
	}

	public void setModelFile(File modelFile) {
		this.modelFile = modelFile;
	}

}
