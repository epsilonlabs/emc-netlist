/**
 */
package org.eclipse.epsilon.netlist.model.blocknet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Netlist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.netlist.model.blocknet.BlockNetlist#getNets <em>Nets</em>}</li>
 *   <li>{@link org.eclipse.epsilon.netlist.model.blocknet.BlockNetlist#getComponentTypes <em>Component Types</em>}</li>
 *   <li>{@link org.eclipse.epsilon.netlist.model.blocknet.BlockNetlist#getCircuitBlocks <em>Circuit Blocks</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.netlist.model.blocknet.BlocknetPackage#getBlockNetlist()
 * @model
 * @generated
 */
public interface BlockNetlist extends EObject {
	/**
	 * Returns the value of the '<em><b>Nets</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.netlist.model.blocknet.Net}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nets</em>' containment reference list.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.BlocknetPackage#getBlockNetlist_Nets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Net> getNets();

	/**
	 * Returns the value of the '<em><b>Component Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.netlist.model.blocknet.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Types</em>' containment reference list.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.BlocknetPackage#getBlockNetlist_ComponentTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentType> getComponentTypes();

	/**
	 * Returns the value of the '<em><b>Circuit Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.netlist.model.blocknet.CircuitBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuit Blocks</em>' containment reference list.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.BlocknetPackage#getBlockNetlist_CircuitBlocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<CircuitBlock> getCircuitBlocks();

} // BlockNetlist
