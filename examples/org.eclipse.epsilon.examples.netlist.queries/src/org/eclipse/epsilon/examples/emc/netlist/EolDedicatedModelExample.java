package org.eclipse.epsilon.examples.emc.netlist;

import java.io.File;

import org.eclipse.epsilon.emc.netlist.ConciseNetlistModel;
import org.eclipse.epsilon.eol.EolModule;

public class EolDedicatedModelExample {

	public static void main(String[] args) throws Exception {
		try (var model = new ConciseNetlistModel()) {
			model.setModelFile("../org.eclipse.epsilon.examples.netlist.model/dialcnet.dat");
			model.setName("Model");
			model.load();

			EolModule module = new EolModule();
			module.parse(new File("example.eol"));
			module.getContext().getModelRepository().addModel(model);
			module.execute();
		}
	}

}
