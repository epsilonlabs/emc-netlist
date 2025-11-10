package org.eclipse.epsilon.emc.netlist;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.collections.set.UnmodifiableSet;

public class Net extends ModelElement {

	private final String name;
	private final Set<Pin> pins = new TreeSet<>();

	public Net(ConciseNetlistModel model, String name) {
		super(model);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Net other = (Net) obj;
		return Objects.equals(name, other.name);
	}

	@SuppressWarnings("unchecked")
	public Set<Pin> getPins() {
		return UnmodifiableSet.decorate(pins);
	}

	public void addPin(Pin pin) {
		pins.add(pin);
	}

	public void removePin(Pin pin) {
		pins.remove(pin);
	}

	@Override
	public String toString() {
		return "Net [name=" + name + "]";
	}

}
