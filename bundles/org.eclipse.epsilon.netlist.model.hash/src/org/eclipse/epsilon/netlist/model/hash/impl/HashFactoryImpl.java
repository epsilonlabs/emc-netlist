/**
 */
package org.eclipse.epsilon.netlist.model.hash.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.epsilon.netlist.model.hash.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HashFactoryImpl extends EFactoryImpl implements HashFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HashFactory init() {
		try {
			HashFactory theHashFactory = (HashFactory)EPackage.Registry.INSTANCE.getEFactory(HashPackage.eNS_URI);
			if (theHashFactory != null) {
				return theHashFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HashFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HashPackage.HASH_MODEL: return createHashModel();
			case HashPackage.COMPONENT_TYPE: return createComponentType();
			case HashPackage.CIRCUIT_BLOCK: return createCircuitBlock();
			case HashPackage.CIRCUIT_BLOCK_INSTANCE: return createCircuitBlockInstance();
			case HashPackage.COMPONENT: return createComponent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HashModel createHashModel() {
		HashModelImpl hashModel = new HashModelImpl();
		return hashModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentType createComponentType() {
		ComponentTypeImpl componentType = new ComponentTypeImpl();
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CircuitBlock createCircuitBlock() {
		CircuitBlockImpl circuitBlock = new CircuitBlockImpl();
		return circuitBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CircuitBlockInstance createCircuitBlockInstance() {
		CircuitBlockInstanceImpl circuitBlockInstance = new CircuitBlockInstanceImpl();
		return circuitBlockInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HashPackage getHashPackage() {
		return (HashPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HashPackage getPackage() {
		return HashPackage.eINSTANCE;
	}

} //HashFactoryImpl
