/**
 */
package sensingflow.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sensingflow.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see sensingflow.model.SensingflowPackage
 * @generated
 */
public class SensingflowSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SensingflowPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowSwitch() {
		if (modelPackage == null) {
			modelPackage = SensingflowPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SensingflowPackage.SENSINGFLOW_CONTAINER: {
				SensingflowContainer sensingflowContainer = (SensingflowContainer)theEObject;
				T result = caseSensingflowContainer(sensingflowContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensingflowPackage.SENSINGFLOW_PROCESSOR: {
				SensingflowProcessor sensingflowProcessor = (SensingflowProcessor)theEObject;
				T result = caseSensingflowProcessor(sensingflowProcessor);
				if (result == null) result = caseSensingflowContainer(sensingflowProcessor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensingflowPackage.SENSINGFLOW_NODE: {
				SensingflowNode sensingflowNode = (SensingflowNode)theEObject;
				T result = caseSensingflowNode(sensingflowNode);
				if (result == null) result = caseSensingflowContainer(sensingflowNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensingflowPackage.SENSINGFLOW_THING: {
				SensingflowThing sensingflowThing = (SensingflowThing)theEObject;
				T result = caseSensingflowThing(sensingflowThing);
				if (result == null) result = caseSensingflowNode(sensingflowThing);
				if (result == null) result = caseSensingflowContainer(sensingflowThing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensingflowPackage.SENSINGFLOW_SENSOR: {
				SensingflowSensor sensingflowSensor = (SensingflowSensor)theEObject;
				T result = caseSensingflowSensor(sensingflowSensor);
				if (result == null) result = caseSensingflowThing(sensingflowSensor);
				if (result == null) result = caseSensingflowNode(sensingflowSensor);
				if (result == null) result = caseSensingflowContainer(sensingflowSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensingflowPackage.SENSINGFLOW_TASK: {
				SensingflowTask sensingflowTask = (SensingflowTask)theEObject;
				T result = caseSensingflowTask(sensingflowTask);
				if (result == null) result = caseSensingflowThing(sensingflowTask);
				if (result == null) result = caseSensingflowNode(sensingflowTask);
				if (result == null) result = caseSensingflowContainer(sensingflowTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensingflowPackage.SENSINGFLOW_LINK: {
				SensingflowLink sensingflowLink = (SensingflowLink)theEObject;
				T result = caseSensingflowLink(sensingflowLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensingflowPackage.SENSINGFLOW_PORT: {
				SensingflowPort sensingflowPort = (SensingflowPort)theEObject;
				T result = caseSensingflowPort(sensingflowPort);
				if (result == null) result = caseSensingflowNode(sensingflowPort);
				if (result == null) result = caseSensingflowContainer(sensingflowPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensingflowPackage.SENSINGFLOW_IN_PORT: {
				SensingflowInPort sensingflowInPort = (SensingflowInPort)theEObject;
				T result = caseSensingflowInPort(sensingflowInPort);
				if (result == null) result = caseSensingflowPort(sensingflowInPort);
				if (result == null) result = caseSensingflowNode(sensingflowInPort);
				if (result == null) result = caseSensingflowContainer(sensingflowInPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensingflowPackage.SENSINGFLOW_OUT_PORT: {
				SensingflowOutPort sensingflowOutPort = (SensingflowOutPort)theEObject;
				T result = caseSensingflowOutPort(sensingflowOutPort);
				if (result == null) result = caseSensingflowPort(sensingflowOutPort);
				if (result == null) result = caseSensingflowNode(sensingflowOutPort);
				if (result == null) result = caseSensingflowContainer(sensingflowOutPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensingflowContainer(SensingflowContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensingflowProcessor(SensingflowProcessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensingflowNode(SensingflowNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensingflowThing(SensingflowThing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensingflowSensor(SensingflowSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensingflowTask(SensingflowTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensingflowLink(SensingflowLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensingflowPort(SensingflowPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensingflowInPort(SensingflowInPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Out Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Out Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensingflowOutPort(SensingflowOutPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SensingflowSwitch
