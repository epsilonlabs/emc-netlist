package org.eclipse.epsilon.emc.netlist;

public class Pin extends ModelElement implements Comparable<Pin> {

	private final Component component;
	private final int number;
	private Net net;

	public Pin(ConciseNetlistModel model, Component cmp, int number) {
		super(model);
		this.component = cmp;
		this.number = number;
	}

	public Net getNet() {
		return net;
	}

	public void setNet(Net net) {
		if (this.net == net) {
			// do nothing (no change)
		} else if (this.net != null) {
			net.removePin(this);
		}

		this.net = net;
		this.net.addPin(this);
	}

	public Component getComponent() {
		return component;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "Pin [component=" + component.getName() + ", pin=" + number + ", net=" + net.getName() + "]";
	}

	@Override
	public int compareTo(Pin oPin) {
		int cmp = component.compareTo(oPin.getComponent());
		if (cmp == 0) {
			return number - oPin.getNumber();
		}
		return cmp;
	}
	
}
