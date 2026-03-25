/**
 */
package org.eclipse.epsilon.netlist.model.blocknet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.netlist.model.blocknet.Net#getPins <em>Pins</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.netlist.model.blocknet.BlocknetPackage#getNet()
 * @model
 * @generated
 */
public interface Net extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Pins</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.netlist.model.blocknet.Pin}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.epsilon.netlist.model.blocknet.Pin#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pins</em>' reference list.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.BlocknetPackage#getNet_Pins()
	 * @see org.eclipse.epsilon.netlist.model.blocknet.Pin#getNet
	 * @model opposite="net"
	 * @generated
	 */
	EList<Pin> getPins();

} // Net
