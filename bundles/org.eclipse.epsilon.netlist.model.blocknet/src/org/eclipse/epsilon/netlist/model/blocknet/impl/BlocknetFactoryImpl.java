/**
 */
package org.eclipse.epsilon.netlist.model.blocknet.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.epsilon.netlist.model.blocknet.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BlocknetFactoryImpl extends EFactoryImpl implements BlocknetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BlocknetFactory init() {
		try {
			BlocknetFactory theBlocknetFactory = (BlocknetFactory)EPackage.Registry.INSTANCE.getEFactory(BlocknetPackage.eNS_URI);
			if (theBlocknetFactory != null) {
				return theBlocknetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BlocknetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlocknetFactoryImpl() {
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
			case BlocknetPackage.BLOCK_NETLIST: return createBlockNetlist();
			case BlocknetPackage.CIRCUIT_BLOCK: return createCircuitBlock();
			case BlocknetPackage.COMPONENT_TYPE: return createComponentType();
			case BlocknetPackage.CIRCUIT_BLOCK_INSTANCE: return createCircuitBlockInstance();
			case BlocknetPackage.NET: return createNet();
			case BlocknetPackage.PIN: return createPin();
			case BlocknetPackage.COMPONENT: return createComponent();
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
	public BlockNetlist createBlockNetlist() {
		BlockNetlistImpl blockNetlist = new BlockNetlistImpl();
		return blockNetlist;
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
	public Net createNet() {
		NetImpl net = new NetImpl();
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin createPin() {
		PinImpl pin = new PinImpl();
		return pin;
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
	public BlocknetPackage getBlocknetPackage() {
		return (BlocknetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BlocknetPackage getPackage() {
		return BlocknetPackage.eINSTANCE;
	}

} //BlocknetFactoryImpl
