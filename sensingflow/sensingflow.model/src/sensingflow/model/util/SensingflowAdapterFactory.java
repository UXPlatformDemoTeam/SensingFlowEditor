/**
 */
package sensingflow.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sensingflow.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sensingflow.model.SensingflowPackage
 * @generated
 */
public class SensingflowAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SensingflowPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SensingflowPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensingflowSwitch<Adapter> modelSwitch =
		new SensingflowSwitch<Adapter>() {
			@Override
			public Adapter caseSensingflowContainer(SensingflowContainer object) {
				return createSensingflowContainerAdapter();
			}
			@Override
			public Adapter caseSensingflowProcessor(SensingflowProcessor object) {
				return createSensingflowProcessorAdapter();
			}
			@Override
			public Adapter caseSensingflowNode(SensingflowNode object) {
				return createSensingflowNodeAdapter();
			}
			@Override
			public Adapter caseSensingflowThing(SensingflowThing object) {
				return createSensingflowThingAdapter();
			}
			@Override
			public Adapter caseSensingflowSensor(SensingflowSensor object) {
				return createSensingflowSensorAdapter();
			}
			@Override
			public Adapter caseSensingflowTask(SensingflowTask object) {
				return createSensingflowTaskAdapter();
			}
			@Override
			public Adapter caseSensingflowLink(SensingflowLink object) {
				return createSensingflowLinkAdapter();
			}
			@Override
			public Adapter caseSensingflowPort(SensingflowPort object) {
				return createSensingflowPortAdapter();
			}
			@Override
			public Adapter caseSensingflowInPort(SensingflowInPort object) {
				return createSensingflowInPortAdapter();
			}
			@Override
			public Adapter caseSensingflowOutPort(SensingflowOutPort object) {
				return createSensingflowOutPortAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link sensingflow.model.SensingflowContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensingflow.model.SensingflowContainer
	 * @generated
	 */
	public Adapter createSensingflowContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensingflow.model.SensingflowProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensingflow.model.SensingflowProcessor
	 * @generated
	 */
	public Adapter createSensingflowProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensingflow.model.SensingflowNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensingflow.model.SensingflowNode
	 * @generated
	 */
	public Adapter createSensingflowNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensingflow.model.SensingflowThing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensingflow.model.SensingflowThing
	 * @generated
	 */
	public Adapter createSensingflowThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensingflow.model.SensingflowSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensingflow.model.SensingflowSensor
	 * @generated
	 */
	public Adapter createSensingflowSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensingflow.model.SensingflowTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensingflow.model.SensingflowTask
	 * @generated
	 */
	public Adapter createSensingflowTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensingflow.model.SensingflowLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensingflow.model.SensingflowLink
	 * @generated
	 */
	public Adapter createSensingflowLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensingflow.model.SensingflowPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensingflow.model.SensingflowPort
	 * @generated
	 */
	public Adapter createSensingflowPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensingflow.model.SensingflowInPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensingflow.model.SensingflowInPort
	 * @generated
	 */
	public Adapter createSensingflowInPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensingflow.model.SensingflowOutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensingflow.model.SensingflowOutPort
	 * @generated
	 */
	public Adapter createSensingflowOutPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SensingflowAdapterFactory
