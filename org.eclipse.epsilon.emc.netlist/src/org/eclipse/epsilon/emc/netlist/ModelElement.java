package org.eclipse.epsilon.emc.netlist;

public abstract class ModelElement {

	private final ConciseNetlistModel model;

	public ModelElement(ConciseNetlistModel model) {
		this.model = model;
	}

	public ConciseNetlistModel getModel() {
		return model;
	}

}
