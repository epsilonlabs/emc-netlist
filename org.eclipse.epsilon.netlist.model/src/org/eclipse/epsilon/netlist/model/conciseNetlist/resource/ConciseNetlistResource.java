package org.eclipse.epsilon.netlist.model.conciseNetlist.resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.epsilon.netlist.model.conciseNetlist.Component;
import org.eclipse.epsilon.netlist.model.conciseNetlist.ConciseNetlistFactory;
import org.eclipse.epsilon.netlist.model.conciseNetlist.Net;
import org.eclipse.epsilon.netlist.model.conciseNetlist.Netlist;
import org.eclipse.epsilon.netlist.model.conciseNetlist.Pin;

public class ConciseNetlistResource extends ResourceImpl {

	private static final String FILE_HEADER = "CONCISE NET LIST - 1";
	private static final String FILE_FOOTER = "END CONCISE NET LIST";

	public ConciseNetlistResource(URI uri) {
		super(uri);
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		try (InputStreamReader isr = new InputStreamReader(inputStream); BufferedReader br = new BufferedReader(isr)) {
			final String firstLine = br.readLine();
			if (firstLine == null && !FILE_HEADER.equals(firstLine)) {
				throw new IllegalStateException("File is not a concise net list in v1 format");
			}

			Netlist model = ConciseNetlistFactory.eINSTANCE.createNetlist();
			var nets = new HashMap<String, Net>();
			var components = new HashMap<String, Component>();

			String line;
			while ((line = br.readLine()) != null && !FILE_FOOTER.equals(line)) {
				var st = new StringTokenizer(line);

				// Split line into parts
				String netName = st.nextToken();
				String componentName = st.nextToken();
				int pinNumber = Integer.parseInt(st.nextToken());
				String[] componentFeatures = st.nextToken().split(",");

				Net net = nets.computeIfAbsent(netName, k -> {
					Net n = ConciseNetlistFactory.eINSTANCE.createNet();
					n.setName(k);
					model.getNets().add(n);
					return n;
				});
				Component component = components.computeIfAbsent(componentName, k -> {
					Component c = ConciseNetlistFactory.eINSTANCE.createComponent();
					c.setName(k);
					model.getComponents().add(c);
					return c;	
				});

				Pin pin = ConciseNetlistFactory.eINSTANCE.createPin();
				pin.setNumber(pinNumber);
				pin.setNet(net);
				component.getPins().add(pin);

				component.getFeatures().addAll(List.of(componentFeatures));
			}

			getContents().add(model);
		}
	}

}
