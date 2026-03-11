/**
 */
package org.eclipse.epsilon.netlist.model.hash;

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
 * @see org.eclipse.epsilon.netlist.model.hash.HashFactory
 * @model kind="package"
 * @generated
 */
public interface HashPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hash";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/epsilon/netlist/hash";

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
	HashPackage eINSTANCE = org.eclipse.epsilon.netlist.model.hash.impl.HashPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.netlist.model.hash.impl.HashModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.netlist.model.hash.impl.HashModelImpl
	 * @see org.eclipse.epsilon.netlist.model.hash.impl.HashPackageImpl#getHashModel()
	 * @generated
	 */
	int HASH_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Component Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_MODEL__COMPONENT_TYPES = 0;

	/**
	 * The feature id for the '<em><b>Circuit Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_MODEL__CIRCUIT_BLOCKS = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.netlist.model.hash.impl.ComponentTypeImpl <em>Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.netlist.model.hash.impl.ComponentTypeImpl
	 * @see org.eclipse.epsilon.netlist.model.hash.impl.HashPackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__INSTANCES = 1;

	/**
	 * The number of structural features of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.netlist.model.hash.impl.CircuitBlockImpl <em>Circuit Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.netlist.model.hash.impl.CircuitBlockImpl
	 * @see org.eclipse.epsilon.netlist.model.hash.impl.HashPackageImpl#getCircuitBlock()
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
	int CIRCUIT_BLOCK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BLOCK__INSTANCES = 1;

	/**
	 * The number of structural features of the '<em>Circuit Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BLOCK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Circuit Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.netlist.model.hash.impl.CircuitBlockInstanceImpl <em>Circuit Block Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.netlist.model.hash.impl.CircuitBlockInstanceImpl
	 * @see org.eclipse.epsilon.netlist.model.hash.impl.HashPackageImpl#getCircuitBlockInstance()
	 * @generated
	 */
	int CIRCUIT_BLOCK_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BLOCK_INSTANCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BLOCK_INSTANCE__COMPONENTS = 1;

	/**
	 * The number of structural features of the '<em>Circuit Block Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BLOCK_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Circuit Block Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BLOCK_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.netlist.model.hash.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.netlist.model.hash.impl.ComponentImpl
	 * @see org.eclipse.epsilon.netlist.model.hash.impl.HashPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 4;

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
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.netlist.model.hash.HashModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.eclipse.epsilon.netlist.model.hash.HashModel
	 * @generated
	 */
	EClass getHashModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.netlist.model.hash.HashModel#getComponentTypes <em>Component Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Types</em>'.
	 * @see org.eclipse.epsilon.netlist.model.hash.HashModel#getComponentTypes()
	 * @see #getHashModel()
	 * @generated
	 */
	EReference getHashModel_ComponentTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.netlist.model.hash.HashModel#getCircuitBlocks <em>Circuit Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Circuit Blocks</em>'.
	 * @see org.eclipse.epsilon.netlist.model.hash.HashModel#getCircuitBlocks()
	 * @see #getHashModel()
	 * @generated
	 */
	EReference getHashModel_CircuitBlocks();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.netlist.model.hash.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type</em>'.
	 * @see org.eclipse.epsilon.netlist.model.hash.ComponentType
	 * @generated
	 */
	EClass getComponentType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.netlist.model.hash.ComponentType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.epsilon.netlist.model.hash.ComponentType#getName()
	 * @see #getComponentType()
	 * @generated
	 */
	EAttribute getComponentType_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.epsilon.netlist.model.hash.ComponentType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see org.eclipse.epsilon.netlist.model.hash.ComponentType#getInstances()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Instances();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.netlist.model.hash.CircuitBlock <em>Circuit Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circuit Block</em>'.
	 * @see org.eclipse.epsilon.netlist.model.hash.CircuitBlock
	 * @generated
	 */
	EClass getCircuitBlock();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.netlist.model.hash.CircuitBlock#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.epsilon.netlist.model.hash.CircuitBlock#getName()
	 * @see #getCircuitBlock()
	 * @generated
	 */
	EAttribute getCircuitBlock_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.netlist.model.hash.CircuitBlock#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see org.eclipse.epsilon.netlist.model.hash.CircuitBlock#getInstances()
	 * @see #getCircuitBlock()
	 * @generated
	 */
	EReference getCircuitBlock_Instances();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.netlist.model.hash.CircuitBlockInstance <em>Circuit Block Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circuit Block Instance</em>'.
	 * @see org.eclipse.epsilon.netlist.model.hash.CircuitBlockInstance
	 * @generated
	 */
	EClass getCircuitBlockInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.netlist.model.hash.CircuitBlockInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.epsilon.netlist.model.hash.CircuitBlockInstance#getName()
	 * @see #getCircuitBlockInstance()
	 * @generated
	 */
	EAttribute getCircuitBlockInstance_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.netlist.model.hash.CircuitBlockInstance#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.eclipse.epsilon.netlist.model.hash.CircuitBlockInstance#getComponents()
	 * @see #getCircuitBlockInstance()
	 * @generated
	 */
	EReference getCircuitBlockInstance_Components();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.netlist.model.hash.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.eclipse.epsilon.netlist.model.hash.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.netlist.model.hash.Component#getCircuitName <em>Circuit Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Circuit Name</em>'.
	 * @see org.eclipse.epsilon.netlist.model.hash.Component#getCircuitName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_CircuitName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.netlist.model.hash.Component#getBlockName <em>Block Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Name</em>'.
	 * @see org.eclipse.epsilon.netlist.model.hash.Component#getBlockName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_BlockName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.netlist.model.hash.Component#getPartNumber <em>Part Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part Number</em>'.
	 * @see org.eclipse.epsilon.netlist.model.hash.Component#getPartNumber()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_PartNumber();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.epsilon.netlist.model.hash.Component#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.epsilon.netlist.model.hash.Component#getType()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HashFactory getHashFactory();

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
		 * The meta object literal for the '{@link org.eclipse.epsilon.netlist.model.hash.impl.HashModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.netlist.model.hash.impl.HashModelImpl
		 * @see org.eclipse.epsilon.netlist.model.hash.impl.HashPackageImpl#getHashModel()
		 * @generated
		 */
		EClass HASH_MODEL = eINSTANCE.getHashModel();

		/**
		 * The meta object literal for the '<em><b>Component Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HASH_MODEL__COMPONENT_TYPES = eINSTANCE.getHashModel_ComponentTypes();

		/**
		 * The meta object literal for the '<em><b>Circuit Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HASH_MODEL__CIRCUIT_BLOCKS = eINSTANCE.getHashModel_CircuitBlocks();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.netlist.model.hash.impl.ComponentTypeImpl <em>Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.netlist.model.hash.impl.ComponentTypeImpl
		 * @see org.eclipse.epsilon.netlist.model.hash.impl.HashPackageImpl#getComponentType()
		 * @generated
		 */
		EClass COMPONENT_TYPE = eINSTANCE.getComponentType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_TYPE__NAME = eINSTANCE.getComponentType_Name();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__INSTANCES = eINSTANCE.getComponentType_Instances();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.netlist.model.hash.impl.CircuitBlockImpl <em>Circuit Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.netlist.model.hash.impl.CircuitBlockImpl
		 * @see org.eclipse.epsilon.netlist.model.hash.impl.HashPackageImpl#getCircuitBlock()
		 * @generated
		 */
		EClass CIRCUIT_BLOCK = eINSTANCE.getCircuitBlock();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCUIT_BLOCK__NAME = eINSTANCE.getCircuitBlock_Name();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT_BLOCK__INSTANCES = eINSTANCE.getCircuitBlock_Instances();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.netlist.model.hash.impl.CircuitBlockInstanceImpl <em>Circuit Block Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.netlist.model.hash.impl.CircuitBlockInstanceImpl
		 * @see org.eclipse.epsilon.netlist.model.hash.impl.HashPackageImpl#getCircuitBlockInstance()
		 * @generated
		 */
		EClass CIRCUIT_BLOCK_INSTANCE = eINSTANCE.getCircuitBlockInstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCUIT_BLOCK_INSTANCE__NAME = eINSTANCE.getCircuitBlockInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT_BLOCK_INSTANCE__COMPONENTS = eINSTANCE.getCircuitBlockInstance_Components();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.netlist.model.hash.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.netlist.model.hash.impl.ComponentImpl
		 * @see org.eclipse.epsilon.netlist.model.hash.impl.HashPackageImpl#getComponent()
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

	}

} //HashPackage
