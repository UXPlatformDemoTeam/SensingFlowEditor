/**
 */
package sensingflow.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sensingflow.model.SensingflowInPort#getTask <em>Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see sensingflow.model.SensingflowPackage#getSensingflowInPort()
 * @model
 * @generated
 */
public interface SensingflowInPort extends SensingflowPort {

	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sensingflow.model.SensingflowTask#getInPorts <em>In Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(SensingflowTask)
	 * @see sensingflow.model.SensingflowPackage#getSensingflowInPort_Task()
	 * @see sensingflow.model.SensingflowTask#getInPorts
	 * @model opposite="inPorts"
	 * @generated
	 */
	SensingflowTask getTask();

	/**
	 * Sets the value of the '{@link sensingflow.model.SensingflowInPort#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(SensingflowTask value);
} // SensingflowInPort
