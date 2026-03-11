/**
 */
package org.eclipse.epsilon.netlist.model.hash.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.epsilon.netlist.model.hash.CircuitBlock;
import org.eclipse.epsilon.netlist.model.hash.ComponentType;
import org.eclipse.epsilon.netlist.model.hash.HashModel;
import org.eclipse.epsilon.netlist.model.hash.HashPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.netlist.model.hash.impl.HashModelImpl#getComponentTypes <em>Component Types</em>}</li>
 *   <li>{@link org.eclipse.epsilon.netlist.model.hash.impl.HashModelImpl#getCircuitBlocks <em>Circuit Blocks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HashModelImpl extends MinimalEObjectImpl.Container implements HashModel {
	/**
	 * The cached value of the '{@link #getComponentTypes() <em>Component Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentType> componentTypes;

	/**
	 * The cached value of the '{@link #getCircuitBlocks() <em>Circuit Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuitBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<CircuitBlock> circuitBlocks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HashModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HashPackage.Literals.HASH_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentType> getComponentTypes() {
		if (componentTypes == null) {
			componentTypes = new EObjectContainmentEList<ComponentType>(ComponentType.class, this, HashPackage.HASH_MODEL__COMPONENT_TYPES);
		}
		return componentTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CircuitBlock> getCircuitBlocks() {
		if (circuitBlocks == null) {
			circuitBlocks = new EObjectContainmentEList<CircuitBlock>(CircuitBlock.class, this, HashPackage.HASH_MODEL__CIRCUIT_BLOCKS);
		}
		return circuitBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HashPackage.HASH_MODEL__COMPONENT_TYPES:
				return ((InternalEList<?>)getComponentTypes()).basicRemove(otherEnd, msgs);
			case HashPackage.HASH_MODEL__CIRCUIT_BLOCKS:
				return ((InternalEList<?>)getCircuitBlocks()).basicRemove(otherEnd, msgs);
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
			case HashPackage.HASH_MODEL__COMPONENT_TYPES:
				return getComponentTypes();
			case HashPackage.HASH_MODEL__CIRCUIT_BLOCKS:
				return getCircuitBlocks();
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
			case HashPackage.HASH_MODEL__COMPONENT_TYPES:
				getComponentTypes().clear();
				getComponentTypes().addAll((Collection<? extends ComponentType>)newValue);
				return;
			case HashPackage.HASH_MODEL__CIRCUIT_BLOCKS:
				getCircuitBlocks().clear();
				getCircuitBlocks().addAll((Collection<? extends CircuitBlock>)newValue);
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
			case HashPackage.HASH_MODEL__COMPONENT_TYPES:
				getComponentTypes().clear();
				return;
			case HashPackage.HASH_MODEL__CIRCUIT_BLOCKS:
				getCircuitBlocks().clear();
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
			case HashPackage.HASH_MODEL__COMPONENT_TYPES:
				return componentTypes != null && !componentTypes.isEmpty();
			case HashPackage.HASH_MODEL__CIRCUIT_BLOCKS:
				return circuitBlocks != null && !circuitBlocks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HashModelImpl
