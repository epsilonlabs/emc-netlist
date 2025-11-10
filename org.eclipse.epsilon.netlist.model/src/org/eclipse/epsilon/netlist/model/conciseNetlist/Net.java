/**
 */
package org.eclipse.epsilon.netlist.model.conciseNetlist;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.netlist.model.conciseNetlist.Net#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.epsilon.netlist.model.conciseNetlist.Net#getPins <em>Pins</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.netlist.model.conciseNetlist.ConciseNetlistPackage#getNet()
 * @model
 * @generated
 */
public interface Net extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.epsilon.netlist.model.conciseNetlist.ConciseNetlistPackage#getNet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.netlist.model.conciseNetlist.Net#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pins</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.netlist.model.conciseNetlist.Pin}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.epsilon.netlist.model.conciseNetlist.Pin#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pins</em>' reference list.
	 * @see org.eclipse.epsilon.netlist.model.conciseNetlist.ConciseNetlistPackage#getNet_Pins()
	 * @see org.eclipse.epsilon.netlist.model.conciseNetlist.Pin#getNet
	 * @model opposite="net"
	 * @generated
	 */
	EList<Pin> getPins();

} // Net
