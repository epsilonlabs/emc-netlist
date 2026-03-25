/**
 */
package org.eclipse.epsilon.netlist.model.blocknet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.epsilon.netlist.model.blocknet.BlockNetlist;
import org.eclipse.epsilon.netlist.model.blocknet.BlocknetPackage;
import org.eclipse.epsilon.netlist.model.blocknet.CircuitBlock;
import org.eclipse.epsilon.netlist.model.blocknet.ComponentType;
import org.eclipse.epsilon.netlist.model.blocknet.Net;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Netlist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.netlist.model.blocknet.impl.BlockNetlistImpl#getNets <em>Nets</em>}</li>
 *   <li>{@link org.eclipse.epsilon.netlist.model.blocknet.impl.BlockNetlistImpl#getComponentTypes <em>Component Types</em>}</li>
 *   <li>{@link org.eclipse.epsilon.netlist.model.blocknet.impl.BlockNetlistImpl#getCircuitBlocks <em>Circuit Blocks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockNetlistImpl extends MinimalEObjectImpl.Container implements BlockNetlist {
	/**
	 * The cached value of the '{@link #getNets() <em>Nets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNets()
	 * @generated
	 * @ordered
	 */
	protected EList<Net> nets;

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
	protected BlockNetlistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlocknetPackage.Literals.BLOCK_NETLIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Net> getNets() {
		if (nets == null) {
			nets = new EObjectContainmentEList<Net>(Net.class, this, BlocknetPackage.BLOCK_NETLIST__NETS);
		}
		return nets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentType> getComponentTypes() {
		if (componentTypes == null) {
			componentTypes = new EObjectContainmentEList<ComponentType>(ComponentType.class, this, BlocknetPackage.BLOCK_NETLIST__COMPONENT_TYPES);
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
			circuitBlocks = new EObjectContainmentEList<CircuitBlock>(CircuitBlock.class, this, BlocknetPackage.BLOCK_NETLIST__CIRCUIT_BLOCKS);
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
			case BlocknetPackage.BLOCK_NETLIST__NETS:
				return ((InternalEList<?>)getNets()).basicRemove(otherEnd, msgs);
			case BlocknetPackage.BLOCK_NETLIST__COMPONENT_TYPES:
				return ((InternalEList<?>)getComponentTypes()).basicRemove(otherEnd, msgs);
			case BlocknetPackage.BLOCK_NETLIST__CIRCUIT_BLOCKS:
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
			case BlocknetPackage.BLOCK_NETLIST__NETS:
				return getNets();
			case BlocknetPackage.BLOCK_NETLIST__COMPONENT_TYPES:
				return getComponentTypes();
			case BlocknetPackage.BLOCK_NETLIST__CIRCUIT_BLOCKS:
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
			case BlocknetPackage.BLOCK_NETLIST__NETS:
				getNets().clear();
				getNets().addAll((Collection<? extends Net>)newValue);
				return;
			case BlocknetPackage.BLOCK_NETLIST__COMPONENT_TYPES:
				getComponentTypes().clear();
				getComponentTypes().addAll((Collection<? extends ComponentType>)newValue);
				return;
			case BlocknetPackage.BLOCK_NETLIST__CIRCUIT_BLOCKS:
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
			case BlocknetPackage.BLOCK_NETLIST__NETS:
				getNets().clear();
				return;
			case BlocknetPackage.BLOCK_NETLIST__COMPONENT_TYPES:
				getComponentTypes().clear();
				return;
			case BlocknetPackage.BLOCK_NETLIST__CIRCUIT_BLOCKS:
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
			case BlocknetPackage.BLOCK_NETLIST__NETS:
				return nets != null && !nets.isEmpty();
			case BlocknetPackage.BLOCK_NETLIST__COMPONENT_TYPES:
				return componentTypes != null && !componentTypes.isEmpty();
			case BlocknetPackage.BLOCK_NETLIST__CIRCUIT_BLOCKS:
				return circuitBlocks != null && !circuitBlocks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BlockNetlistImpl
