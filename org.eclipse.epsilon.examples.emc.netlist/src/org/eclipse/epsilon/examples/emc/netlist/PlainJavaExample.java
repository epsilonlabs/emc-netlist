package org.eclipse.epsilon.examples.emc.netlist;

import java.io.File;

import org.eclipse.epsilon.emc.netlist.ConciseNetlistModel;

public class PlainJavaExample {

	public static void main(String[] args) throws Exception {
		try (var model = new ConciseNetlistModel()) {
			model.setModelFile(new File("dialcnet.dat"));
			model.load();

			System.out.println("Nets: " + model.getAllOfKind("Net"));
			System.out.println("Components: " + model.getAllOfKind("Component"));
			System.out.println("Pins:  " + model.getAllOfKind("Pin"));
		}
	}

}
