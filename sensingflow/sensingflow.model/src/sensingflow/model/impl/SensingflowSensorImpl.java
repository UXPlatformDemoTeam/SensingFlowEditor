/**
 */
package sensingflow.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import sensingflow.model.SensingflowPackage;
import sensingflow.model.SensingflowSensor;
import sensingflow.model.SensingflowSensorType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sensingflow.model.impl.SensingflowSensorImpl#getOperatorName <em>Operator Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated NOT
 */
public class SensingflowSensorImpl extends SensingflowThingImpl implements SensingflowSensor {
	/**
	 * The default value of the '{@link #getOperatorName() <em>Operator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorName()
	 * @generated
	 * @ordered
	 */
	protected static final SensingflowSensorType OPERATOR_NAME_EDEFAULT = SensingflowSensorType.DEFAULT_SENSOR;
	/**
	 * The cached value of the '{@link #getOperatorName() <em>Operator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorName()
	 * @generated NOT
	 * @ordered
	 */
	protected SensingflowSensorType operatorName = OPERATOR_NAME_EDEFAULT;
	
	protected SensingflowSensorType OldoperatorName = OPERATOR_NAME_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensingflowSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensingflowPackage.Literals.SENSINGFLOW_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowSensorType getOperatorName() {
		return operatorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setOperatorName(SensingflowSensorType newOperatorName) {
		// DKIM: save the old operator name
		this.OldoperatorName = operatorName;
		SensingflowSensorType oldOperatorName = operatorName;
		operatorName = newOperatorName == null ? OPERATOR_NAME_EDEFAULT : newOperatorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensingflowPackage.SENSINGFLOW_SENSOR__OPERATOR_NAME, oldOperatorName, operatorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SensingflowPackage.SENSINGFLOW_SENSOR__OPERATOR_NAME:
				return getOperatorName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SensingflowPackage.SENSINGFLOW_SENSOR__OPERATOR_NAME:
				setOperatorName((SensingflowSensorType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SensingflowPackage.SENSINGFLOW_SENSOR__OPERATOR_NAME:
				setOperatorName(OPERATOR_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SensingflowPackage.SENSINGFLOW_SENSOR__OPERATOR_NAME:
				return operatorName != OPERATOR_NAME_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operatorName: ");
		result.append(operatorName);
		result.append(')');
		return result.toString();
	}

	@Override
	public SensingflowSensorType getOldOperatorName() {
		// TODO Auto-generated method stub
		return OldoperatorName;
	}

	@Override
	public void setOldOperatorName(SensingflowSensorType value) {
		OldoperatorName = value;
		
	}

} //SensingflowSensorImpl
