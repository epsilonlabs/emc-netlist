/**
 */
package org.eclipse.epsilon.netlist.model.blocknet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circuit Block Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.netlist.model.blocknet.CircuitBlockInstance#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.netlist.model.blocknet.BlocknetPackage#getCircuitBlockInstance()
 * @model
 * @generated
 */
public interface CircuitBlockInstance extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.netlist.model.blocknet.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.BlocknetPackage#getCircuitBlockInstance_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

} // CircuitBlockInstance
