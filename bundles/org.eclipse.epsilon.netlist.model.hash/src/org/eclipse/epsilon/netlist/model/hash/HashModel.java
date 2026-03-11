/**
 */
package org.eclipse.epsilon.netlist.model.hash;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.netlist.model.hash.HashModel#getComponentTypes <em>Component Types</em>}</li>
 *   <li>{@link org.eclipse.epsilon.netlist.model.hash.HashModel#getCircuitBlocks <em>Circuit Blocks</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.netlist.model.hash.HashPackage#getHashModel()
 * @model
 * @generated
 */
public interface HashModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.netlist.model.hash.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Types</em>' containment reference list.
	 * @see org.eclipse.epsilon.netlist.model.hash.HashPackage#getHashModel_ComponentTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentType> getComponentTypes();

	/**
	 * Returns the value of the '<em><b>Circuit Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.netlist.model.hash.CircuitBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuit Blocks</em>' containment reference list.
	 * @see org.eclipse.epsilon.netlist.model.hash.HashPackage#getHashModel_CircuitBlocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<CircuitBlock> getCircuitBlocks();

} // HashModel
