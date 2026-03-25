/**
 */
package org.eclipse.epsilon.netlist.model.blocknet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.netlist.model.blocknet.Component#getCircuitName <em>Circuit Name</em>}</li>
 *   <li>{@link org.eclipse.epsilon.netlist.model.blocknet.Component#getBlockName <em>Block Name</em>}</li>
 *   <li>{@link org.eclipse.epsilon.netlist.model.blocknet.Component#getPartNumber <em>Part Number</em>}</li>
 *   <li>{@link org.eclipse.epsilon.netlist.model.blocknet.Component#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.epsilon.netlist.model.blocknet.Component#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.eclipse.epsilon.netlist.model.blocknet.Component#getPins <em>Pins</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.netlist.model.blocknet.BlocknetPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Circuit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuit Name</em>' attribute.
	 * @see #setCircuitName(String)
	 * @see org.eclipse.epsilon.netlist.model.blocknet.BlocknetPackage#getComponent_CircuitName()
	 * @model
	 * @generated
	 */
	String getCircuitName();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.netlist.model.blocknet.Component#getCircuitName <em>Circuit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circuit Name</em>' attribute.
	 * @see #getCircuitName()
	 * @generated
	 */
	void setCircuitName(String value);

	/**
	 * Returns the value of the '<em><b>Block Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Name</em>' attribute.
	 * @see #setBlockName(String)
	 * @see org.eclipse.epsilon.netlist.model.blocknet.BlocknetPackage#getComponent_BlockName()
	 * @model
	 * @generated
	 */
	String getBlockName();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.netlist.model.blocknet.Component#getBlockName <em>Block Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Name</em>' attribute.
	 * @see #getBlockName()
	 * @generated
	 */
	void setBlockName(String value);

	/**
	 * Returns the value of the '<em><b>Part Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Number</em>' attribute.
	 * @see #setPartNumber(String)
	 * @see org.eclipse.epsilon.netlist.model.blocknet.BlocknetPackage#getComponent_PartNumber()
	 * @model
	 * @generated
	 */
	String getPartNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.netlist.model.blocknet.Component#getPartNumber <em>Part Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Number</em>' attribute.
	 * @see #getPartNumber()
	 * @generated
	 */
	void setPartNumber(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.epsilon.netlist.model.blocknet.ComponentType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ComponentType)
	 * @see org.eclipse.epsilon.netlist.model.blocknet.BlocknetPackage#getComponent_Type()
	 * @see org.eclipse.epsilon.netlist.model.blocknet.ComponentType#getInstances
	 * @model opposite="instances"
	 * @generated
	 */
	ComponentType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.netlist.model.blocknet.Component#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ComponentType value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' attribute list.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.BlocknetPackage#getComponent_Features()
	 * @model
	 * @generated
	 */
	EList<String> getFeatures();

	/**
	 * Returns the value of the '<em><b>Pins</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.netlist.model.blocknet.Pin}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.epsilon.netlist.model.blocknet.Pin#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pins</em>' containment reference list.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.BlocknetPackage#getComponent_Pins()
	 * @see org.eclipse.epsilon.netlist.model.blocknet.Pin#getComponent
	 * @model opposite="component" containment="true"
	 * @generated
	 */
	EList<Pin> getPins();

} // Component
