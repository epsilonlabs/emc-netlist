package org.eclipse.epsilon.emc.netlist;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

import org.apache.commons.collections.collection.UnmodifiableCollection;

public class Component extends ModelElement implements Comparable<Component> {

	private final String name;
	private final Map<Integer, Pin> pins = new TreeMap<>();
	private List<String> features = List.of();

	public Component(ConciseNetlistModel model, String name) {
		super(model);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@SuppressWarnings("unchecked")
	public Collection<Pin> getPins() {
		return UnmodifiableCollection.decorate(pins.values());
	}

	public Pin getPin(int pinNumber) {
		return pins.get(pinNumber);
	}

	public void setPin(int pinNumber, Net net) {
		Pin pin = pins.get(pinNumber);
		if (pin == null) {
			pin = new Pin(getModel(), this, pinNumber);
			pins.put(pinNumber, pin);
		}
		pin.setNet(net);
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

	public List<String> getFeatures() {
		// Note: set is already unmodifiable from creation
		return features;
	}

	public void setFeatures(List<String> features) {
		this.features = features;
	}

	@Override
	public int compareTo(Component o) {
		return getName().compareTo(o.getName());
	}

	@Override
	public String toString() {
		return "Component [name=" + name + ", pins=" + getPins() + ", features=" + features + "]";
	}

}
