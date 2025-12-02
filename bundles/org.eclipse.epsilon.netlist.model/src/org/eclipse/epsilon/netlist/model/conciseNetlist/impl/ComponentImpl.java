/**
 */
package org.eclipse.epsilon.netlist.model.conciseNetlist.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.epsilon.netlist.model.conciseNetlist.Component;
import org.eclipse.epsilon.netlist.model.conciseNetlist.ConciseNetlistPackage;
import org.eclipse.epsilon.netlist.model.conciseNetlist.Net;
import org.eclipse.epsilon.netlist.model.conciseNetlist.Pin;
import org.eclipse.epsilon.netlist.model.conciseNetlist.util.ConciseNetlistSwitch;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.netlist.model.conciseNetlist.impl.ComponentImpl#getPins <em>Pins</em>}</li>
 *   <li>{@link org.eclipse.epsilon.netlist.model.conciseNetlist.impl.ComponentImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends NamedElementImpl implements Component {
	/**
	 * The cached value of the '{@link #getPins() <em>Pins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPins()
	 * @generated
	 * @ordered
	 */
	protected EList<Pin> pins;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<String> features;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConciseNetlistPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Pin> getPins() {
		if (pins == null) {
			pins = new EObjectContainmentWithInverseEList<Pin>(Pin.class, this, ConciseNetlistPackage.COMPONENT__PINS, ConciseNetlistPackage.PIN__COMPONENT);
		}
		return pins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getFeatures() {
		if (features == null) {
			features = new EDataTypeUniqueEList<String>(String.class, this, ConciseNetlistPackage.COMPONENT__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns true if and only if this component is directly or indirectly connected to the specific net.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isConnectedTo(Net net) {
		ConciseNetlistSwitch<List<EObject>> switchStep = new ConciseNetlistSwitch<>() {
			@Override
			public List<EObject> caseNet(Net object) {
				List<EObject> l = new ArrayList<>();
				for (Pin pin : object.getPins()) {
					l.add(pin.getComponent());
				}
				return l;
			}

			@Override
			public List<EObject> caseComponent(Component object) {
				return Collections.unmodifiableList(object.getPins());
			}

			@Override
			public List<EObject> casePin(Pin object) {
				return Collections.singletonList(object.getNet());
			}
		};

		Queue<EObject> sourceQueue = new ArrayDeque<>();
		Set<EObject> sourceVisited = new HashSet<>();
		sourceQueue.add(this);

		Queue<EObject> targetQueue = new ArrayDeque<>();
		Set<EObject> targetVisited = new HashSet<>();
		targetQueue.add(net);

		while (!sourceQueue.isEmpty() || !targetQueue.isEmpty()) {
			// We try to expand one step starting from the component
			if (!sourceQueue.isEmpty()) {
				EObject nextSource = sourceQueue.poll();
				if (nextSource == net) {
					return true;
				}

				List<EObject> following = switchStep.doSwitch(nextSource);
				for (EObject eob : following) {
					if (targetVisited.contains(eob)) {
						// Met in the middle - connected
						return true;
					}
					if (sourceVisited.add(eob)) {
						// Haven't visited this one yet
						sourceQueue.add(eob);
					}
				}
			}

			// We try to expand one step starting from the net
			if (!targetQueue.isEmpty()) {
				EObject nextTarget = targetQueue.poll();
				if (nextTarget == this) {
					return true;
				}

				List<EObject> following = switchStep.doSwitch(nextTarget);
				for (EObject eob : following) {
					if (sourceVisited.contains(eob)) {
						// Met in the middle - connected
						return true;
					}
					if (targetVisited.add(eob)) {
						targetQueue.add(eob);
					}
				}
			}
		}

		// No path found from the component to the net
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConciseNetlistPackage.COMPONENT__PINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPins()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConciseNetlistPackage.COMPONENT__PINS:
				return ((InternalEList<?>)getPins()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConciseNetlistPackage.COMPONENT__PINS:
				return getPins();
			case ConciseNetlistPackage.COMPONENT__FEATURES:
				return getFeatures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConciseNetlistPackage.COMPONENT__PINS:
				getPins().clear();
				getPins().addAll((Collection<? extends Pin>)newValue);
				return;
			case ConciseNetlistPackage.COMPONENT__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConciseNetlistPackage.COMPONENT__PINS:
				getPins().clear();
				return;
			case ConciseNetlistPackage.COMPONENT__FEATURES:
				getFeatures().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConciseNetlistPackage.COMPONENT__PINS:
				return pins != null && !pins.isEmpty();
			case ConciseNetlistPackage.COMPONENT__FEATURES:
				return features != null && !features.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ConciseNetlistPackage.COMPONENT___IS_CONNECTED_TO__NET:
				return isConnectedTo((Net)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (features: ");
		result.append(features);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
