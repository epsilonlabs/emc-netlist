package org.eclipse.epsilon.netlist.cli;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.epsilon.netlist.model.blocknet.BlocknetPackage;
import org.eclipse.epsilon.netlist.model.concise.ConcisePackage;
import org.eclipse.epsilon.netlist.model.concise.resource.ConciseNetlistResourceFactory;
import org.eclipse.epsilon.netlist.model.hash.HashPackage;
import org.eclipse.epsilon.netlist.model.hash.resource.HashResourceFactory;

public class Setup {

	private Setup() {}
	
	public static void setupMetamodels() {
		// Make sure the metamodels are registered
		ConcisePackage.eINSTANCE.getName();
		HashPackage.eINSTANCE.getName();
		BlocknetPackage.eINSTANCE.getName();

		// Register the resource factories as well
		Registry registry = Resource.Factory.Registry.INSTANCE;
		registry.getExtensionToFactoryMap().put("dat", new ConciseNetlistResourceFactory());
		registry.getExtensionToFactoryMap().put("hash", new HashResourceFactory());
	}
	
}
