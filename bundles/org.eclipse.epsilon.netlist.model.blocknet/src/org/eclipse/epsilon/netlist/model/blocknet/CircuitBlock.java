/**
 */
package org.eclipse.epsilon.netlist.model.blocknet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circuit Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.netlist.model.blocknet.CircuitBlock#getInstances <em>Instances</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.netlist.model.blocknet.BlocknetPackage#getCircuitBlock()
 * @model
 * @generated
 */
public interface CircuitBlock extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.netlist.model.blocknet.CircuitBlockInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.BlocknetPackage#getCircuitBlock_Instances()
	 * @model containment="true"
	 * @generated
	 */
	EList<CircuitBlockInstance> getInstances();

} // CircuitBlock
