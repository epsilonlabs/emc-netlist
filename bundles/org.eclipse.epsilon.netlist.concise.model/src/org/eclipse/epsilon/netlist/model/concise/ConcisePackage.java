/**
 */
package org.eclipse.epsilon.netlist.model.concise;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.epsilon.netlist.model.concise.ConciseFactory
 * @model kind="package"
 * @generated
 */
public interface ConcisePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "concise";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/epsilon/netlist/concise";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConcisePackage eINSTANCE = org.eclipse.epsilon.netlist.model.concise.impl.ConcisePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.netlist.model.concise.impl.NetlistImpl <em>Netlist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.netlist.model.concise.impl.NetlistImpl
	 * @see org.eclipse.epsilon.netlist.model.concise.impl.ConcisePackageImpl#getNetlist()
	 * @generated
	 */
	int NETLIST = 0;

	/**
	 * The feature id for the '<em><b>Nets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETLIST__NETS = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETLIST__COMPONENTS = 1;

	/**
	 * The number of structural features of the '<em>Netlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETLIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Netlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETLIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.netlist.model.concise.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.netlist.model.concise.impl.NamedElementImpl
	 * @see org.eclipse.epsilon.netlist.model.concise.impl.ConcisePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.netlist.model.concise.impl.NetImpl <em>Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.netlist.model.concise.impl.NetImpl
	 * @see org.eclipse.epsilon.netlist.model.concise.impl.ConcisePackageImpl#getNet()
	 * @generated
	 */
	int NET = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET__PINS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.netlist.model.concise.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.netlist.model.concise.impl.ComponentImpl
	 * @see org.eclipse.epsilon.netlist.model.concise.impl.ConcisePackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PINS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__FEATURES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Connected To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___IS_CONNECTED_TO__NET = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.netlist.model.concise.impl.PinImpl <em>Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.netlist.model.concise.impl.PinImpl
	 * @see org.eclipse.epsilon.netlist.model.concise.impl.ConcisePackageImpl#getPin()
	 * @generated
	 */
	int PIN = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__COMPONENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Net</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__NET = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.netlist.model.concise.Netlist <em>Netlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Netlist</em>'.
	 * @see org.eclipse.epsilon.netlist.model.concise.Netlist
	 * @generated
	 */
	EClass getNetlist();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.netlist.model.concise.Netlist#getNets <em>Nets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nets</em>'.
	 * @see org.eclipse.epsilon.netlist.model.concise.Netlist#getNets()
	 * @see #getNetlist()
	 * @generated
	 */
	EReference getNetlist_Nets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.netlist.model.concise.Netlist#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.eclipse.epsilon.netlist.model.concise.Netlist#getComponents()
	 * @see #getNetlist()
	 * @generated
	 */
	EReference getNetlist_Components();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.netlist.model.concise.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.eclipse.epsilon.netlist.model.concise.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.netlist.model.concise.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.epsilon.netlist.model.concise.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.netlist.model.concise.Net <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Net</em>'.
	 * @see org.eclipse.epsilon.netlist.model.concise.Net
	 * @generated
	 */
	EClass getNet();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.epsilon.netlist.model.concise.Net#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pins</em>'.
	 * @see org.eclipse.epsilon.netlist.model.concise.Net#getPins()
	 * @see #getNet()
	 * @generated
	 */
	EReference getNet_Pins();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.netlist.model.concise.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.eclipse.epsilon.netlist.model.concise.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.netlist.model.concise.Component#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pins</em>'.
	 * @see org.eclipse.epsilon.netlist.model.concise.Component#getPins()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Pins();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.epsilon.netlist.model.concise.Component#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Features</em>'.
	 * @see org.eclipse.epsilon.netlist.model.concise.Component#getFeatures()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Features();

	/**
	 * Returns the meta object for the '{@link org.eclipse.epsilon.netlist.model.concise.Component#isConnectedTo(org.eclipse.epsilon.netlist.model.concise.Net) <em>Is Connected To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Connected To</em>' operation.
	 * @see org.eclipse.epsilon.netlist.model.concise.Component#isConnectedTo(org.eclipse.epsilon.netlist.model.concise.Net)
	 * @generated
	 */
	EOperation getComponent__IsConnectedTo__Net();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.netlist.model.concise.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin</em>'.
	 * @see org.eclipse.epsilon.netlist.model.concise.Pin
	 * @generated
	 */
	EClass getPin();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.epsilon.netlist.model.concise.Pin#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see org.eclipse.epsilon.netlist.model.concise.Pin#getComponent()
	 * @see #getPin()
	 * @generated
	 */
	EReference getPin_Component();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.epsilon.netlist.model.concise.Pin#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Net</em>'.
	 * @see org.eclipse.epsilon.netlist.model.concise.Pin#getNet()
	 * @see #getPin()
	 * @generated
	 */
	EReference getPin_Net();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConciseFactory getConciseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.netlist.model.concise.impl.NetlistImpl <em>Netlist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.netlist.model.concise.impl.NetlistImpl
		 * @see org.eclipse.epsilon.netlist.model.concise.impl.ConcisePackageImpl#getNetlist()
		 * @generated
		 */
		EClass NETLIST = eINSTANCE.getNetlist();

		/**
		 * The meta object literal for the '<em><b>Nets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETLIST__NETS = eINSTANCE.getNetlist_Nets();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETLIST__COMPONENTS = eINSTANCE.getNetlist_Components();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.netlist.model.concise.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.netlist.model.concise.impl.NamedElementImpl
		 * @see org.eclipse.epsilon.netlist.model.concise.impl.ConcisePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.netlist.model.concise.impl.NetImpl <em>Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.netlist.model.concise.impl.NetImpl
		 * @see org.eclipse.epsilon.netlist.model.concise.impl.ConcisePackageImpl#getNet()
		 * @generated
		 */
		EClass NET = eINSTANCE.getNet();

		/**
		 * The meta object literal for the '<em><b>Pins</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NET__PINS = eINSTANCE.getNet_Pins();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.netlist.model.concise.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.netlist.model.concise.impl.ComponentImpl
		 * @see org.eclipse.epsilon.netlist.model.concise.impl.ConcisePackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PINS = eINSTANCE.getComponent_Pins();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__FEATURES = eINSTANCE.getComponent_Features();

		/**
		 * The meta object literal for the '<em><b>Is Connected To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT___IS_CONNECTED_TO__NET = eINSTANCE.getComponent__IsConnectedTo__Net();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.netlist.model.concise.impl.PinImpl <em>Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.netlist.model.concise.impl.PinImpl
		 * @see org.eclipse.epsilon.netlist.model.concise.impl.ConcisePackageImpl#getPin()
		 * @generated
		 */
		EClass PIN = eINSTANCE.getPin();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIN__COMPONENT = eINSTANCE.getPin_Component();

		/**
		 * The meta object literal for the '<em><b>Net</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIN__NET = eINSTANCE.getPin_Net();

	}

} //ConcisePackage
