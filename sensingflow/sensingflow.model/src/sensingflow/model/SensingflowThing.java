/**
 */
package sensingflow.model;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sensingflow.model.SensingflowThing#getName <em>Name</em>}</li>
 *   <li>{@link sensingflow.model.SensingflowThing#getLogicParameter <em>Logic Parameter</em>}</li>
 *   <li>{@link sensingflow.model.SensingflowThing#getDeviceId <em>Device Id</em>}</li>
 *   <li>{@link sensingflow.model.SensingflowThing#getInstantParameter <em>Instant Parameter</em>}</li>
 *   <li>{@link sensingflow.model.SensingflowThing#getOutPorts <em>Out Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see sensingflow.model.SensingflowPackage#getSensingflowThing()
 * @model
 * @generated
 */
public interface SensingflowThing extends SensingflowNode {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"<...>"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sensingflow.model.SensingflowPackage#getSensingflowThing_Name()
	 * @model default="<...>"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sensingflow.model.SensingflowThing#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Logic Parameter</b></em>' attribute.
	 * The default value is <code>"<...>"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logic Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logic Parameter</em>' attribute.
	 * @see #setLogicParameter(String)
	 * @see sensingflow.model.SensingflowPackage#getSensingflowThing_LogicParameter()
	 * @model default="<...>" ordered="false"
	 * @generated
	 */
	String getLogicParameter();

	/**
	 * Sets the value of the '{@link sensingflow.model.SensingflowThing#getLogicParameter <em>Logic Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logic Parameter</em>' attribute.
	 * @see #getLogicParameter()
	 * @generated
	 */
	void setLogicParameter(String value);

	/**
	 * Returns the value of the '<em><b>Device Id</b></em>' attribute.
	 * The default value is <code>"<...>"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Id</em>' attribute.
	 * @see #setDeviceId(String)
	 * @see sensingflow.model.SensingflowPackage#getSensingflowThing_DeviceId()
	 * @model default="<...>" ordered="false"
	 * @generated
	 */
	String getDeviceId();

	/**
	 * Sets the value of the '{@link sensingflow.model.SensingflowThing#getDeviceId <em>Device Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Id</em>' attribute.
	 * @see #getDeviceId()
	 * @generated
	 */
	void setDeviceId(String value);

	/**
	 * Returns the value of the '<em><b>Instant Parameter</b></em>' attribute.
	 * The default value is <code>"<...>"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instant Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instant Parameter</em>' attribute.
	 * @see #setInstantParameter(String)
	 * @see sensingflow.model.SensingflowPackage#getSensingflowThing_InstantParameter()
	 * @model default="<...>" ordered="false"
	 * @generated
	 */
	String getInstantParameter();

	/**
	 * Sets the value of the '{@link sensingflow.model.SensingflowThing#getInstantParameter <em>Instant Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instant Parameter</em>' attribute.
	 * @see #getInstantParameter()
	 * @generated
	 */
	void setInstantParameter(String value);

	/**
	 * Returns the value of the '<em><b>Out Ports</b></em>' reference list.
	 * The list contents are of type {@link sensingflow.model.SensingflowOutPort}.
	 * It is bidirectional and its opposite is '{@link sensingflow.model.SensingflowOutPort#getThing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Ports</em>' reference list.
	 * @see sensingflow.model.SensingflowPackage#getSensingflowThing_OutPorts()
	 * @see sensingflow.model.SensingflowOutPort#getThing
	 * @model opposite="thing"
	 * @generated
	 */
	EList<SensingflowOutPort> getOutPorts();

} // SensingflowThing
