/**
 */
package org.eclipse.epsilon.netlist.model.blocknet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.epsilon.netlist.model.blocknet.BlocknetPackage
 * @generated
 */
public interface BlocknetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BlocknetFactory eINSTANCE = org.eclipse.epsilon.netlist.model.blocknet.impl.BlocknetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Block Netlist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block Netlist</em>'.
	 * @generated
	 */
	BlockNetlist createBlockNetlist();

	/**
	 * Returns a new object of class '<em>Circuit Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Circuit Block</em>'.
	 * @generated
	 */
	CircuitBlock createCircuitBlock();

	/**
	 * Returns a new object of class '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Type</em>'.
	 * @generated
	 */
	ComponentType createComponentType();

	/**
	 * Returns a new object of class '<em>Circuit Block Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Circuit Block Instance</em>'.
	 * @generated
	 */
	CircuitBlockInstance createCircuitBlockInstance();

	/**
	 * Returns a new object of class '<em>Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Net</em>'.
	 * @generated
	 */
	Net createNet();

	/**
	 * Returns a new object of class '<em>Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pin</em>'.
	 * @generated
	 */
	Pin createPin();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BlocknetPackage getBlocknetPackage();

} //BlocknetFactory
