/**
 */
package org.eclipse.epsilon.netlist.model.hash;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.netlist.model.hash.ComponentType#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.epsilon.netlist.model.hash.ComponentType#getInstances <em>Instances</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.netlist.model.hash.HashPackage#getComponentType()
 * @model
 * @generated
 */
public interface ComponentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.epsilon.netlist.model.hash.HashPackage#getComponentType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.netlist.model.hash.ComponentType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.netlist.model.hash.Component}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.epsilon.netlist.model.hash.Component#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see org.eclipse.epsilon.netlist.model.hash.HashPackage#getComponentType_Instances()
	 * @see org.eclipse.epsilon.netlist.model.hash.Component#getType
	 * @model opposite="type"
	 * @generated
	 */
	EList<Component> getInstances();

} // ComponentType
