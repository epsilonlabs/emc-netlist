package org.eclipse.epsilon.emc.netlist;

import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import org.apache.commons.collections.map.UnmodifiableMap;

public class Component extends ModelElement implements Comparable<Component> {

	private final String name;

	private final Map<Integer, Net> pins = new TreeMap<>();
	private Set<String> features = Set.of();

	public Component(ConciseNetlistModel model, String name) {
		super(model);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@SuppressWarnings("unchecked")
	public Map<Integer, Net> getPins() {
		return UnmodifiableMap.decorate(pins);
	}

	public Net getPin(int pinNumber) {
		return pins.get(pinNumber);
	}

	public void setPin(int pinNumber, Net net) {
		Net oldNet = pins.remove(pinNumber);
		if (oldNet != null) {
			oldNet.removeComponent(this);
		}

		pins.put(pinNumber, net);
		net.addComponent(this);
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
		Component other = (Component) obj;
		return Objects.equals(name, other.name);
	}

	public Set<String> getFeatures() {
		// Note: set is already unmodifiable from creation
		return features;
	}

	public void setFeatures(Set<String> features) {
		this.features = features;
	}

	@Override
	public int compareTo(Component o) {
		return getName().compareTo(o.getName());
	}

	@Override
	public String toString() {
		return "Component [name=" + name + ", pins=" + pins + ", features=" + features + "]";
	}

}
