/**
 */
package org.eclipse.epsilon.netlist.model.blocknet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.netlist.model.blocknet.ComponentType#getInstances <em>Instances</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.netlist.model.blocknet.BlocknetPackage#getComponentType()
 * @model
 * @generated
 */
public interface ComponentType extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.netlist.model.blocknet.Component}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.epsilon.netlist.model.blocknet.Component#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.BlocknetPackage#getComponentType_Instances()
	 * @see org.eclipse.epsilon.netlist.model.blocknet.Component#getType
	 * @model opposite="type"
	 * @generated
	 */
	EList<Component> getInstances();

} // ComponentType
