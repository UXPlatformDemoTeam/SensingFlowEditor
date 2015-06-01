/**
 */
package sensingflow.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sensingflow.model.SensingflowSensor#getOperatorName <em>Operator Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see sensingflow.model.SensingflowPackage#getSensingflowSensor()
 * @model
 * @generated NOT
 */
public interface SensingflowSensor extends SensingflowThing {

	/**
	 * Returns the value of the '<em><b>Operator Name</b></em>' attribute.
	 * The literals are from the enumeration {@link sensingflow.model.SensingflowSensorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator Name</em>' attribute.
	 * @see sensingflow.model.SensingflowSensorType
	 * @see #setOperatorName(SensingflowSensorType)
	 * @see sensingflow.model.SensingflowPackage#getSensingflowSensor_OperatorName()
	 * @model
	 * @generated
	 */
	SensingflowSensorType getOperatorName();

	/**
	 * Sets the value of the '{@link sensingflow.model.SensingflowSensor#getOperatorName <em>Operator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator Name</em>' attribute.
	 * @see sensingflow.model.SensingflowSensorType
	 * @see #getOperatorName()
	 * @generated
	 */
	void setOperatorName(SensingflowSensorType value);
	
	SensingflowSensorType getOldOperatorName();
	void setOldOperatorName(SensingflowSensorType value);
} // SensingflowSensor
