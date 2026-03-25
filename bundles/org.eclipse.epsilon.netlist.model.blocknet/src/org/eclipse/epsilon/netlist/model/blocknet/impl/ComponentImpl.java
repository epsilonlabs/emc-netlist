/**
 */
package org.eclipse.epsilon.netlist.model.blocknet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.epsilon.netlist.model.blocknet.BlocknetPackage;
import org.eclipse.epsilon.netlist.model.blocknet.Component;
import org.eclipse.epsilon.netlist.model.blocknet.ComponentType;
import org.eclipse.epsilon.netlist.model.blocknet.Pin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.netlist.model.blocknet.impl.ComponentImpl#getCircuitName <em>Circuit Name</em>}</li>
 *   <li>{@link org.eclipse.epsilon.netlist.model.blocknet.impl.ComponentImpl#getBlockName <em>Block Name</em>}</li>
 *   <li>{@link org.eclipse.epsilon.netlist.model.blocknet.impl.ComponentImpl#getPartNumber <em>Part Number</em>}</li>
 *   <li>{@link org.eclipse.epsilon.netlist.model.blocknet.impl.ComponentImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.epsilon.netlist.model.blocknet.impl.ComponentImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.eclipse.epsilon.netlist.model.blocknet.impl.ComponentImpl#getPins <em>Pins</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
	/**
	 * The default value of the '{@link #getCircuitName() <em>Circuit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuitName()
	 * @generated
	 * @ordered
	 */
	protected static final String CIRCUIT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCircuitName() <em>Circuit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuitName()
	 * @generated
	 * @ordered
	 */
	protected String circuitName = CIRCUIT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlockName() <em>Block Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockName()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOCK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockName() <em>Block Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockName()
	 * @generated
	 * @ordered
	 */
	protected String blockName = BLOCK_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartNumber() <em>Part Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PART_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartNumber() <em>Part Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartNumber()
	 * @generated
	 * @ordered
	 */
	protected String partNumber = PART_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ComponentType type;

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
	 * The cached value of the '{@link #getPins() <em>Pins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPins()
	 * @generated
	 * @ordered
	 */
	protected EList<Pin> pins;

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
		return BlocknetPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCircuitName() {
		return circuitName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCircuitName(String newCircuitName) {
		String oldCircuitName = circuitName;
		circuitName = newCircuitName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlocknetPackage.COMPONENT__CIRCUIT_NAME, oldCircuitName, circuitName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBlockName() {
		return blockName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlockName(String newBlockName) {
		String oldBlockName = blockName;
		blockName = newBlockName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlocknetPackage.COMPONENT__BLOCK_NAME, oldBlockName, blockName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartNumber() {
		return partNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartNumber(String newPartNumber) {
		String oldPartNumber = partNumber;
		partNumber = newPartNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlocknetPackage.COMPONENT__PART_NUMBER, oldPartNumber, partNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (ComponentType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlocknetPackage.COMPONENT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ComponentType newType, NotificationChain msgs) {
		ComponentType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlocknetPackage.COMPONENT__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ComponentType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, BlocknetPackage.COMPONENT_TYPE__INSTANCES, ComponentType.class, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, BlocknetPackage.COMPONENT_TYPE__INSTANCES, ComponentType.class, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlocknetPackage.COMPONENT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getFeatures() {
		if (features == null) {
			features = new EDataTypeUniqueEList<String>(String.class, this, BlocknetPackage.COMPONENT__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Pin> getPins() {
		if (pins == null) {
			pins = new EObjectContainmentWithInverseEList<Pin>(Pin.class, this, BlocknetPackage.COMPONENT__PINS, BlocknetPackage.PIN__COMPONENT);
		}
		return pins;
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
			case BlocknetPackage.COMPONENT__TYPE:
				if (type != null)
					msgs = ((InternalEObject)type).eInverseRemove(this, BlocknetPackage.COMPONENT_TYPE__INSTANCES, ComponentType.class, msgs);
				return basicSetType((ComponentType)otherEnd, msgs);
			case BlocknetPackage.COMPONENT__PINS:
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
			case BlocknetPackage.COMPONENT__TYPE:
				return basicSetType(null, msgs);
			case BlocknetPackage.COMPONENT__PINS:
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
			case BlocknetPackage.COMPONENT__CIRCUIT_NAME:
				return getCircuitName();
			case BlocknetPackage.COMPONENT__BLOCK_NAME:
				return getBlockName();
			case BlocknetPackage.COMPONENT__PART_NUMBER:
				return getPartNumber();
			case BlocknetPackage.COMPONENT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case BlocknetPackage.COMPONENT__FEATURES:
				return getFeatures();
			case BlocknetPackage.COMPONENT__PINS:
				return getPins();
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
			case BlocknetPackage.COMPONENT__CIRCUIT_NAME:
				setCircuitName((String)newValue);
				return;
			case BlocknetPackage.COMPONENT__BLOCK_NAME:
				setBlockName((String)newValue);
				return;
			case BlocknetPackage.COMPONENT__PART_NUMBER:
				setPartNumber((String)newValue);
				return;
			case BlocknetPackage.COMPONENT__TYPE:
				setType((ComponentType)newValue);
				return;
			case BlocknetPackage.COMPONENT__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends String>)newValue);
				return;
			case BlocknetPackage.COMPONENT__PINS:
				getPins().clear();
				getPins().addAll((Collection<? extends Pin>)newValue);
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
			case BlocknetPackage.COMPONENT__CIRCUIT_NAME:
				setCircuitName(CIRCUIT_NAME_EDEFAULT);
				return;
			case BlocknetPackage.COMPONENT__BLOCK_NAME:
				setBlockName(BLOCK_NAME_EDEFAULT);
				return;
			case BlocknetPackage.COMPONENT__PART_NUMBER:
				setPartNumber(PART_NUMBER_EDEFAULT);
				return;
			case BlocknetPackage.COMPONENT__TYPE:
				setType((ComponentType)null);
				return;
			case BlocknetPackage.COMPONENT__FEATURES:
				getFeatures().clear();
				return;
			case BlocknetPackage.COMPONENT__PINS:
				getPins().clear();
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
			case BlocknetPackage.COMPONENT__CIRCUIT_NAME:
				return CIRCUIT_NAME_EDEFAULT == null ? circuitName != null : !CIRCUIT_NAME_EDEFAULT.equals(circuitName);
			case BlocknetPackage.COMPONENT__BLOCK_NAME:
				return BLOCK_NAME_EDEFAULT == null ? blockName != null : !BLOCK_NAME_EDEFAULT.equals(blockName);
			case BlocknetPackage.COMPONENT__PART_NUMBER:
				return PART_NUMBER_EDEFAULT == null ? partNumber != null : !PART_NUMBER_EDEFAULT.equals(partNumber);
			case BlocknetPackage.COMPONENT__TYPE:
				return type != null;
			case BlocknetPackage.COMPONENT__FEATURES:
				return features != null && !features.isEmpty();
			case BlocknetPackage.COMPONENT__PINS:
				return pins != null && !pins.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (circuitName: ");
		result.append(circuitName);
		result.append(", blockName: ");
		result.append(blockName);
		result.append(", partNumber: ");
		result.append(partNumber);
		result.append(", features: ");
		result.append(features);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
