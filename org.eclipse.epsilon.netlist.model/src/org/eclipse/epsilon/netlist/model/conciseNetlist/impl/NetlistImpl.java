/**
 */
package org.eclipse.epsilon.netlist.model.conciseNetlist.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.epsilon.netlist.model.conciseNetlist.Component;
import org.eclipse.epsilon.netlist.model.conciseNetlist.ConciseNetlistPackage;
import org.eclipse.epsilon.netlist.model.conciseNetlist.Net;
import org.eclipse.epsilon.netlist.model.conciseNetlist.Netlist;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Netlist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.netlist.model.conciseNetlist.impl.NetlistImpl#getNets <em>Nets</em>}</li>
 *   <li>{@link org.eclipse.epsilon.netlist.model.conciseNetlist.impl.NetlistImpl#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetlistImpl extends MinimalEObjectImpl.Container implements Netlist {
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
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetlistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConciseNetlistPackage.Literals.NETLIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Net> getNets() {
		if (nets == null) {
			nets = new EObjectContainmentEList<Net>(Net.class, this, ConciseNetlistPackage.NETLIST__NETS);
		}
		return nets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this, ConciseNetlistPackage.NETLIST__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConciseNetlistPackage.NETLIST__NETS:
				return ((InternalEList<?>)getNets()).basicRemove(otherEnd, msgs);
			case ConciseNetlistPackage.NETLIST__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
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
			case ConciseNetlistPackage.NETLIST__NETS:
				return getNets();
			case ConciseNetlistPackage.NETLIST__COMPONENTS:
				return getComponents();
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
			case ConciseNetlistPackage.NETLIST__NETS:
				getNets().clear();
				getNets().addAll((Collection<? extends Net>)newValue);
				return;
			case ConciseNetlistPackage.NETLIST__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
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
			case ConciseNetlistPackage.NETLIST__NETS:
				getNets().clear();
				return;
			case ConciseNetlistPackage.NETLIST__COMPONENTS:
				getComponents().clear();
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
			case ConciseNetlistPackage.NETLIST__NETS:
				return nets != null && !nets.isEmpty();
			case ConciseNetlistPackage.NETLIST__COMPONENTS:
				return components != null && !components.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NetlistImpl
