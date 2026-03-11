/**
 */
package org.eclipse.epsilon.netlist.model.hash.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.epsilon.netlist.model.hash.Component;
import org.eclipse.epsilon.netlist.model.hash.ComponentType;
import org.eclipse.epsilon.netlist.model.hash.HashPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.netlist.model.hash.impl.ComponentImpl#getCircuitName <em>Circuit Name</em>}</li>
 *   <li>{@link org.eclipse.epsilon.netlist.model.hash.impl.ComponentImpl#getBlockName <em>Block Name</em>}</li>
 *   <li>{@link org.eclipse.epsilon.netlist.model.hash.impl.ComponentImpl#getPartNumber <em>Part Number</em>}</li>
 *   <li>{@link org.eclipse.epsilon.netlist.model.hash.impl.ComponentImpl#getType <em>Type</em>}</li>
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
		return HashPackage.Literals.COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HashPackage.COMPONENT__CIRCUIT_NAME, oldCircuitName, circuitName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HashPackage.COMPONENT__BLOCK_NAME, oldBlockName, blockName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HashPackage.COMPONENT__PART_NUMBER, oldPartNumber, partNumber));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HashPackage.COMPONENT__TYPE, oldType, type));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HashPackage.COMPONENT__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, HashPackage.COMPONENT_TYPE__INSTANCES, ComponentType.class, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, HashPackage.COMPONENT_TYPE__INSTANCES, ComponentType.class, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HashPackage.COMPONENT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HashPackage.COMPONENT__TYPE:
				if (type != null)
					msgs = ((InternalEObject)type).eInverseRemove(this, HashPackage.COMPONENT_TYPE__INSTANCES, ComponentType.class, msgs);
				return basicSetType((ComponentType)otherEnd, msgs);
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
			case HashPackage.COMPONENT__TYPE:
				return basicSetType(null, msgs);
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
			case HashPackage.COMPONENT__CIRCUIT_NAME:
				return getCircuitName();
			case HashPackage.COMPONENT__BLOCK_NAME:
				return getBlockName();
			case HashPackage.COMPONENT__PART_NUMBER:
				return getPartNumber();
			case HashPackage.COMPONENT__TYPE:
				if (resolve) return getType();
				return basicGetType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HashPackage.COMPONENT__CIRCUIT_NAME:
				setCircuitName((String)newValue);
				return;
			case HashPackage.COMPONENT__BLOCK_NAME:
				setBlockName((String)newValue);
				return;
			case HashPackage.COMPONENT__PART_NUMBER:
				setPartNumber((String)newValue);
				return;
			case HashPackage.COMPONENT__TYPE:
				setType((ComponentType)newValue);
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
			case HashPackage.COMPONENT__CIRCUIT_NAME:
				setCircuitName(CIRCUIT_NAME_EDEFAULT);
				return;
			case HashPackage.COMPONENT__BLOCK_NAME:
				setBlockName(BLOCK_NAME_EDEFAULT);
				return;
			case HashPackage.COMPONENT__PART_NUMBER:
				setPartNumber(PART_NUMBER_EDEFAULT);
				return;
			case HashPackage.COMPONENT__TYPE:
				setType((ComponentType)null);
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
			case HashPackage.COMPONENT__CIRCUIT_NAME:
				return CIRCUIT_NAME_EDEFAULT == null ? circuitName != null : !CIRCUIT_NAME_EDEFAULT.equals(circuitName);
			case HashPackage.COMPONENT__BLOCK_NAME:
				return BLOCK_NAME_EDEFAULT == null ? blockName != null : !BLOCK_NAME_EDEFAULT.equals(blockName);
			case HashPackage.COMPONENT__PART_NUMBER:
				return PART_NUMBER_EDEFAULT == null ? partNumber != null : !PART_NUMBER_EDEFAULT.equals(partNumber);
			case HashPackage.COMPONENT__TYPE:
				return type != null;
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
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
