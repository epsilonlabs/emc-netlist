package org.eclipse.epsilon.examples.emc.netlist;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.netlist.model.conciseNetlist.ConciseNetlistPackage;
import org.eclipse.epsilon.netlist.model.conciseNetlist.resource.ConciseNetlistResourceFactory;

public class PlainJavaExample {

	public static void main(String[] args) throws Exception {
		// Register resource factory and EPackage
		Resource.Factory.Registry.INSTANCE
			.getExtensionToFactoryMap().put("dat", new ConciseNetlistResourceFactory());
		EPackage.Registry.INSTANCE
			.put(ConciseNetlistPackage.eNS_URI, ConciseNetlistPackage.eINSTANCE);

		// Load model and try it out
		try (var model = new EmfModel()) {
			model.setModelFile("../org.eclipse.epsilon.examples.netlist.model/dialcnet.dat");
			model.setMetamodelUri(ConciseNetlistPackage.eNS_URI);
			model.setName("Model");
			model.load();

			System.out.println("Nets: " + model.getAllOfKind("Net"));
			System.out.println("Components: " + model.getAllOfKind("Component"));
			System.out.println("Pins:  " + model.getAllOfKind("Pin"));
		}
	}

}
