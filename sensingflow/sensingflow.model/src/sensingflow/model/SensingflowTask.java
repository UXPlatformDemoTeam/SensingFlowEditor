/**
 */
package sensingflow.model;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sensingflow.model.SensingflowTask#getInPorts <em>In Ports</em>}</li>
 *   <li>{@link sensingflow.model.SensingflowTask#getOperatorName <em>Operator Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see sensingflow.model.SensingflowPackage#getSensingflowTask()
 * @model
 * @generated NOT
 */
public interface SensingflowTask extends SensingflowThing {

	/**
	 * Returns the value of the '<em><b>In Ports</b></em>' reference list.
	 * The list contents are of type {@link sensingflow.model.SensingflowInPort}.
	 * It is bidirectional and its opposite is '{@link sensingflow.model.SensingflowInPort#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Ports</em>' reference list.
	 * @see sensingflow.model.SensingflowPackage#getSensingflowTask_InPorts()
	 * @see sensingflow.model.SensingflowInPort#getTask
	 * @model opposite="task"
	 * @generated
	 */
	EList<SensingflowInPort> getInPorts();

	/**
	 * Returns the value of the '<em><b>Operator Name</b></em>' attribute.
	 * The literals are from the enumeration {@link sensingflow.model.SensingflowTaskType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator Name</em>' attribute.
	 * @see sensingflow.model.SensingflowTaskType
	 * @see #setOperatorName(SensingflowTaskType)
	 * @see sensingflow.model.SensingflowPackage#getSensingflowTask_OperatorName()
	 * @model
	 * @generated
	 */
	SensingflowTaskType getOperatorName();

	/**
	 * Sets the value of the '{@link sensingflow.model.SensingflowTask#getOperatorName <em>Operator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator Name</em>' attribute.
	 * @see sensingflow.model.SensingflowTaskType
	 * @see #getOperatorName()
	 * @generated
	 */
	void setOperatorName(SensingflowTaskType value);
	
	SensingflowTaskType getOldOperatorName();
	void setOldOperatorName(SensingflowTaskType value);
} // SensingflowTask
