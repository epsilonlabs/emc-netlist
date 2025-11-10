package org.eclipse.epsilon.examples.emc.netlist;

import java.io.File;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.netlist.model.conciseNetlist.ConciseNetlistPackage;
import org.eclipse.epsilon.netlist.model.conciseNetlist.resource.ConciseNetlistResourceFactory;

public class EOLExample {

	public static void main(String[] args) throws Exception {
		// Register EMF metamodel and resource factory
		Resource.Factory.Registry.INSTANCE
			.getExtensionToFactoryMap().put("dat", new ConciseNetlistResourceFactory());
		EPackage.Registry.INSTANCE
			.put(ConciseNetlistPackage.eNS_URI, ConciseNetlistPackage.eINSTANCE);

		try (var model = new EmfModel()) {
			model.setModelFile("dialcnet.dat");
			model.setName("Model");
			model.setMetamodelUri(ConciseNetlistPackage.eNS_URI);
			model.load();

			EolModule module = new EolModule();
			module.parse(new File("example.eol"));
			module.getContext().getModelRepository().addModel(model);
			module.execute();
		}
	}

}
