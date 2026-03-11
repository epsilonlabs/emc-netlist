/**
 */
package org.eclipse.epsilon.netlist.model.hash;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circuit Block Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.netlist.model.hash.CircuitBlockInstance#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.epsilon.netlist.model.hash.CircuitBlockInstance#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.netlist.model.hash.HashPackage#getCircuitBlockInstance()
 * @model
 * @generated
 */
public interface CircuitBlockInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.epsilon.netlist.model.hash.HashPackage#getCircuitBlockInstance_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.netlist.model.hash.CircuitBlockInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.netlist.model.hash.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.eclipse.epsilon.netlist.model.hash.HashPackage#getCircuitBlockInstance_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

} // CircuitBlockInstance
