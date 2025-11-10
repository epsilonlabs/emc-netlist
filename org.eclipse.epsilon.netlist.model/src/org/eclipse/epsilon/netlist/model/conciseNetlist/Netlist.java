/**
 */
package org.eclipse.epsilon.netlist.model.conciseNetlist;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Netlist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.netlist.model.conciseNetlist.Netlist#getNets <em>Nets</em>}</li>
 *   <li>{@link org.eclipse.epsilon.netlist.model.conciseNetlist.Netlist#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.netlist.model.conciseNetlist.ConciseNetlistPackage#getNetlist()
 * @model
 * @generated
 */
public interface Netlist extends EObject {
	/**
	 * Returns the value of the '<em><b>Nets</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.netlist.model.conciseNetlist.Net}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nets</em>' containment reference list.
	 * @see org.eclipse.epsilon.netlist.model.conciseNetlist.ConciseNetlistPackage#getNetlist_Nets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Net> getNets();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.netlist.model.conciseNetlist.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.eclipse.epsilon.netlist.model.conciseNetlist.ConciseNetlistPackage#getNetlist_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

} // Netlist
