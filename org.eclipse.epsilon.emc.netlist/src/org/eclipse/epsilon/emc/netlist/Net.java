package org.eclipse.epsilon.emc.netlist;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.collections.set.UnmodifiableSet;

public class Net extends ModelElement {

	private final String name;
	private final Set<Component> components = new TreeSet<>();

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
	public Set<Component> getComponents() {
		return UnmodifiableSet.decorate(components);
	}

	public void addComponent(Component component) {
		components.add(component);
	}

	public void removeComponent(Component component) {
		components.remove(component);
	}

	@Override
	public String toString() {
		return "Net [name=" + name + "]";
	}

}
