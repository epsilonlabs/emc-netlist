/**
 */
package org.eclipse.epsilon.netlist.model.blocknet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.netlist.model.blocknet.Pin#getComponent <em>Component</em>}</li>
 *   <li>{@link org.eclipse.epsilon.netlist.model.blocknet.Pin#getNet <em>Net</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.netlist.model.blocknet.BlocknetPackage#getPin()
 * @model
 * @generated
 */
public interface Pin extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.epsilon.netlist.model.blocknet.Component#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' container reference.
	 * @see #setComponent(Component)
	 * @see org.eclipse.epsilon.netlist.model.blocknet.BlocknetPackage#getPin_Component()
	 * @see org.eclipse.epsilon.netlist.model.blocknet.Component#getPins
	 * @model opposite="pins" transient="false"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.netlist.model.blocknet.Pin#getComponent <em>Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' container reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Net</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.epsilon.netlist.model.blocknet.Net#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' reference.
	 * @see #setNet(Net)
	 * @see org.eclipse.epsilon.netlist.model.blocknet.BlocknetPackage#getPin_Net()
	 * @see org.eclipse.epsilon.netlist.model.blocknet.Net#getPins
	 * @model opposite="pins"
	 * @generated
	 */
	Net getNet();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.netlist.model.blocknet.Pin#getNet <em>Net</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(Net value);

} // Pin
