/**
 */
package org.eclipse.epsilon.netlist.model.concise;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.netlist.model.concise.Component#getPins <em>Pins</em>}</li>
 *   <li>{@link org.eclipse.epsilon.netlist.model.concise.Component#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.netlist.model.concise.ConcisePackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Pins</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.netlist.model.concise.Pin}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.epsilon.netlist.model.concise.Pin#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pins</em>' containment reference list.
	 * @see org.eclipse.epsilon.netlist.model.concise.ConcisePackage#getComponent_Pins()
	 * @see org.eclipse.epsilon.netlist.model.concise.Pin#getComponent
	 * @model opposite="component" containment="true"
	 * @generated
	 */
	EList<Pin> getPins();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' attribute list.
	 * @see org.eclipse.epsilon.netlist.model.concise.ConcisePackage#getComponent_Features()
	 * @model
	 * @generated
	 */
	EList<String> getFeatures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isConnectedTo(Net net);

} // Component
