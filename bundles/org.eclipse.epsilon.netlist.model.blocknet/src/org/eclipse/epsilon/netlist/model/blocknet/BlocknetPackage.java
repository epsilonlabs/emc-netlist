/**
 */
package org.eclipse.epsilon.netlist.model.blocknet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.eclipse.epsilon.netlist.model.blocknet.BlocknetFactory
 * @model kind="package"
 * @generated
 */
public interface BlocknetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "blocknet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/epsilon/netlist/blocknet";

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
	BlocknetPackage eINSTANCE = org.eclipse.epsilon.netlist.model.blocknet.impl.BlocknetPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.netlist.model.blocknet.impl.BlockNetlistImpl <em>Block Netlist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.BlockNetlistImpl
	 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.BlocknetPackageImpl#getBlockNetlist()
	 * @generated
	 */
	int BLOCK_NETLIST = 0;

	/**
	 * The feature id for the '<em><b>Nets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_NETLIST__NETS = 0;

	/**
	 * The feature id for the '<em><b>Component Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_NETLIST__COMPONENT_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Circuit Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_NETLIST__CIRCUIT_BLOCKS = 2;

	/**
	 * The number of structural features of the '<em>Block Netlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_NETLIST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Block Netlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_NETLIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.netlist.model.blocknet.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.NamedElementImpl
	 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.BlocknetPackageImpl#getNamedElement()
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
	 * The meta object id for the '{@link org.eclipse.epsilon.netlist.model.blocknet.impl.CircuitBlockImpl <em>Circuit Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.CircuitBlockImpl
	 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.BlocknetPackageImpl#getCircuitBlock()
	 * @generated
	 */
	int CIRCUIT_BLOCK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BLOCK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BLOCK__INSTANCES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Circuit Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BLOCK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Circuit Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BLOCK_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.netlist.model.blocknet.impl.ComponentTypeImpl <em>Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.ComponentTypeImpl
	 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.BlocknetPackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__INSTANCES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.netlist.model.blocknet.impl.CircuitBlockInstanceImpl <em>Circuit Block Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.CircuitBlockInstanceImpl
	 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.BlocknetPackageImpl#getCircuitBlockInstance()
	 * @generated
	 */
	int CIRCUIT_BLOCK_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BLOCK_INSTANCE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BLOCK_INSTANCE__COMPONENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Circuit Block Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BLOCK_INSTANCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Circuit Block Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BLOCK_INSTANCE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.netlist.model.blocknet.impl.NetImpl <em>Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.NetImpl
	 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.BlocknetPackageImpl#getNet()
	 * @generated
	 */
	int NET = 5;

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
	 * The meta object id for the '{@link org.eclipse.epsilon.netlist.model.blocknet.impl.PinImpl <em>Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.PinImpl
	 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.BlocknetPackageImpl#getPin()
	 * @generated
	 */
	int PIN = 6;

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
	 * The meta object id for the '{@link org.eclipse.epsilon.netlist.model.blocknet.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.ComponentImpl
	 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.BlocknetPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 7;

	/**
	 * The feature id for the '<em><b>Circuit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CIRCUIT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Block Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__BLOCK_NAME = 1;

	/**
	 * The feature id for the '<em><b>Part Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PART_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Features</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__FEATURES = 4;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PINS = 5;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.netlist.model.blocknet.BlockNetlist <em>Block Netlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Netlist</em>'.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.BlockNetlist
	 * @generated
	 */
	EClass getBlockNetlist();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.netlist.model.blocknet.BlockNetlist#getNets <em>Nets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nets</em>'.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.BlockNetlist#getNets()
	 * @see #getBlockNetlist()
	 * @generated
	 */
	EReference getBlockNetlist_Nets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.netlist.model.blocknet.BlockNetlist#getComponentTypes <em>Component Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Types</em>'.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.BlockNetlist#getComponentTypes()
	 * @see #getBlockNetlist()
	 * @generated
	 */
	EReference getBlockNetlist_ComponentTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.netlist.model.blocknet.BlockNetlist#getCircuitBlocks <em>Circuit Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Circuit Blocks</em>'.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.BlockNetlist#getCircuitBlocks()
	 * @see #getBlockNetlist()
	 * @generated
	 */
	EReference getBlockNetlist_CircuitBlocks();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.netlist.model.blocknet.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.netlist.model.blocknet.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.netlist.model.blocknet.CircuitBlock <em>Circuit Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circuit Block</em>'.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.CircuitBlock
	 * @generated
	 */
	EClass getCircuitBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.netlist.model.blocknet.CircuitBlock#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.CircuitBlock#getInstances()
	 * @see #getCircuitBlock()
	 * @generated
	 */
	EReference getCircuitBlock_Instances();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.netlist.model.blocknet.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type</em>'.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.ComponentType
	 * @generated
	 */
	EClass getComponentType();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.epsilon.netlist.model.blocknet.ComponentType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.ComponentType#getInstances()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Instances();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.netlist.model.blocknet.CircuitBlockInstance <em>Circuit Block Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circuit Block Instance</em>'.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.CircuitBlockInstance
	 * @generated
	 */
	EClass getCircuitBlockInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.netlist.model.blocknet.CircuitBlockInstance#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.CircuitBlockInstance#getComponents()
	 * @see #getCircuitBlockInstance()
	 * @generated
	 */
	EReference getCircuitBlockInstance_Components();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.netlist.model.blocknet.Net <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Net</em>'.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.Net
	 * @generated
	 */
	EClass getNet();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.epsilon.netlist.model.blocknet.Net#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pins</em>'.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.Net#getPins()
	 * @see #getNet()
	 * @generated
	 */
	EReference getNet_Pins();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.netlist.model.blocknet.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin</em>'.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.Pin
	 * @generated
	 */
	EClass getPin();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.epsilon.netlist.model.blocknet.Pin#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.Pin#getComponent()
	 * @see #getPin()
	 * @generated
	 */
	EReference getPin_Component();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.epsilon.netlist.model.blocknet.Pin#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Net</em>'.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.Pin#getNet()
	 * @see #getPin()
	 * @generated
	 */
	EReference getPin_Net();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.netlist.model.blocknet.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.netlist.model.blocknet.Component#getCircuitName <em>Circuit Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Circuit Name</em>'.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.Component#getCircuitName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_CircuitName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.netlist.model.blocknet.Component#getBlockName <em>Block Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Name</em>'.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.Component#getBlockName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_BlockName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.netlist.model.blocknet.Component#getPartNumber <em>Part Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part Number</em>'.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.Component#getPartNumber()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_PartNumber();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.epsilon.netlist.model.blocknet.Component#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.Component#getType()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.epsilon.netlist.model.blocknet.Component#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Features</em>'.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.Component#getFeatures()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Features();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.netlist.model.blocknet.Component#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pins</em>'.
	 * @see org.eclipse.epsilon.netlist.model.blocknet.Component#getPins()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Pins();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BlocknetFactory getBlocknetFactory();

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
		 * The meta object literal for the '{@link org.eclipse.epsilon.netlist.model.blocknet.impl.BlockNetlistImpl <em>Block Netlist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.BlockNetlistImpl
		 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.BlocknetPackageImpl#getBlockNetlist()
		 * @generated
		 */
		EClass BLOCK_NETLIST = eINSTANCE.getBlockNetlist();

		/**
		 * The meta object literal for the '<em><b>Nets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_NETLIST__NETS = eINSTANCE.getBlockNetlist_Nets();

		/**
		 * The meta object literal for the '<em><b>Component Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_NETLIST__COMPONENT_TYPES = eINSTANCE.getBlockNetlist_ComponentTypes();

		/**
		 * The meta object literal for the '<em><b>Circuit Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_NETLIST__CIRCUIT_BLOCKS = eINSTANCE.getBlockNetlist_CircuitBlocks();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.netlist.model.blocknet.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.NamedElementImpl
		 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.BlocknetPackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link org.eclipse.epsilon.netlist.model.blocknet.impl.CircuitBlockImpl <em>Circuit Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.CircuitBlockImpl
		 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.BlocknetPackageImpl#getCircuitBlock()
		 * @generated
		 */
		EClass CIRCUIT_BLOCK = eINSTANCE.getCircuitBlock();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT_BLOCK__INSTANCES = eINSTANCE.getCircuitBlock_Instances();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.netlist.model.blocknet.impl.ComponentTypeImpl <em>Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.ComponentTypeImpl
		 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.BlocknetPackageImpl#getComponentType()
		 * @generated
		 */
		EClass COMPONENT_TYPE = eINSTANCE.getComponentType();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__INSTANCES = eINSTANCE.getComponentType_Instances();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.netlist.model.blocknet.impl.CircuitBlockInstanceImpl <em>Circuit Block Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.CircuitBlockInstanceImpl
		 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.BlocknetPackageImpl#getCircuitBlockInstance()
		 * @generated
		 */
		EClass CIRCUIT_BLOCK_INSTANCE = eINSTANCE.getCircuitBlockInstance();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT_BLOCK_INSTANCE__COMPONENTS = eINSTANCE.getCircuitBlockInstance_Components();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.netlist.model.blocknet.impl.NetImpl <em>Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.NetImpl
		 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.BlocknetPackageImpl#getNet()
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
		 * The meta object literal for the '{@link org.eclipse.epsilon.netlist.model.blocknet.impl.PinImpl <em>Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.PinImpl
		 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.BlocknetPackageImpl#getPin()
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

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.netlist.model.blocknet.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.ComponentImpl
		 * @see org.eclipse.epsilon.netlist.model.blocknet.impl.BlocknetPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Circuit Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__CIRCUIT_NAME = eINSTANCE.getComponent_CircuitName();

		/**
		 * The meta object literal for the '<em><b>Block Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__BLOCK_NAME = eINSTANCE.getComponent_BlockName();

		/**
		 * The meta object literal for the '<em><b>Part Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__PART_NUMBER = eINSTANCE.getComponent_PartNumber();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__TYPE = eINSTANCE.getComponent_Type();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__FEATURES = eINSTANCE.getComponent_Features();

		/**
		 * The meta object literal for the '<em><b>Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PINS = eINSTANCE.getComponent_Pins();

	}

} //BlocknetPackage
