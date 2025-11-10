/**
 */
package org.eclipse.epsilon.netlist.model.conciseNetlist;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.netlist.model.conciseNetlist.Pin#getNumber <em>Number</em>}</li>
 *   <li>{@link org.eclipse.epsilon.netlist.model.conciseNetlist.Pin#getComponent <em>Component</em>}</li>
 *   <li>{@link org.eclipse.epsilon.netlist.model.conciseNetlist.Pin#getNet <em>Net</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.netlist.model.conciseNetlist.ConciseNetlistPackage#getPin()
 * @model
 * @generated
 */
public interface Pin extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see org.eclipse.epsilon.netlist.model.conciseNetlist.ConciseNetlistPackage#getPin_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.netlist.model.conciseNetlist.Pin#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.epsilon.netlist.model.conciseNetlist.Component#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' container reference.
	 * @see #setComponent(Component)
	 * @see org.eclipse.epsilon.netlist.model.conciseNetlist.ConciseNetlistPackage#getPin_Component()
	 * @see org.eclipse.epsilon.netlist.model.conciseNetlist.Component#getPins
	 * @model opposite="pins" transient="false"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.netlist.model.conciseNetlist.Pin#getComponent <em>Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' container reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Net</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.epsilon.netlist.model.conciseNetlist.Net#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' reference.
	 * @see #setNet(Net)
	 * @see org.eclipse.epsilon.netlist.model.conciseNetlist.ConciseNetlistPackage#getPin_Net()
	 * @see org.eclipse.epsilon.netlist.model.conciseNetlist.Net#getPins
	 * @model opposite="pins"
	 * @generated
	 */
	Net getNet();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.netlist.model.conciseNetlist.Pin#getNet <em>Net</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(Net value);

} // Pin
