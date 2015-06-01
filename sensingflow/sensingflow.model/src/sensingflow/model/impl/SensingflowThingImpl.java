/**
 */
package sensingflow.model.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import sensingflow.model.SensingflowOutPort;
import sensingflow.model.SensingflowPackage;
import sensingflow.model.SensingflowThing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sensingflow.model.impl.SensingflowThingImpl#getName <em>Name</em>}</li>
 *   <li>{@link sensingflow.model.impl.SensingflowThingImpl#getLogicParameter <em>Logic Parameter</em>}</li>
 *   <li>{@link sensingflow.model.impl.SensingflowThingImpl#getDeviceId <em>Device Id</em>}</li>
 *   <li>{@link sensingflow.model.impl.SensingflowThingImpl#getInstantParameter <em>Instant Parameter</em>}</li>
 *   <li>{@link sensingflow.model.impl.SensingflowThingImpl#getOutPorts <em>Out Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SensingflowThingImpl extends SensingflowNodeImpl implements SensingflowThing {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "<...>";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogicParameter() <em>Logic Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGIC_PARAMETER_EDEFAULT = "<...>";

	/**
	 * The cached value of the '{@link #getLogicParameter() <em>Logic Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicParameter()
	 * @generated
	 * @ordered
	 */
	protected String logicParameter = LOGIC_PARAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeviceId() <em>Device Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceId()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_ID_EDEFAULT = "<...>";

	/**
	 * The cached value of the '{@link #getDeviceId() <em>Device Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceId()
	 * @generated
	 * @ordered
	 */
	protected String deviceId = DEVICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstantParameter() <em>Instant Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANT_PARAMETER_EDEFAULT = "<...>";

	/**
	 * The cached value of the '{@link #getInstantParameter() <em>Instant Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantParameter()
	 * @generated
	 * @ordered
	 */
	protected String instantParameter = INSTANT_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutPorts() <em>Out Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<SensingflowOutPort> outPorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensingflowThingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensingflowPackage.Literals.SENSINGFLOW_THING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensingflowPackage.SENSINGFLOW_THING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogicParameter() {
		return logicParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicParameter(String newLogicParameter) {
		String oldLogicParameter = logicParameter;
		logicParameter = newLogicParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensingflowPackage.SENSINGFLOW_THING__LOGIC_PARAMETER, oldLogicParameter, logicParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeviceId() {
		return deviceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceId(String newDeviceId) {
		String oldDeviceId = deviceId;
		deviceId = newDeviceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensingflowPackage.SENSINGFLOW_THING__DEVICE_ID, oldDeviceId, deviceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstantParameter() {
		return instantParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantParameter(String newInstantParameter) {
		String oldInstantParameter = instantParameter;
		instantParameter = newInstantParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensingflowPackage.SENSINGFLOW_THING__INSTANT_PARAMETER, oldInstantParameter, instantParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensingflowOutPort> getOutPorts() {
		if (outPorts == null) {
			outPorts = new EObjectWithInverseResolvingEList<SensingflowOutPort>(SensingflowOutPort.class, this, SensingflowPackage.SENSINGFLOW_THING__OUT_PORTS, SensingflowPackage.SENSINGFLOW_OUT_PORT__THING);
		}
		return outPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SensingflowPackage.SENSINGFLOW_THING__OUT_PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutPorts()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SensingflowPackage.SENSINGFLOW_THING__OUT_PORTS:
				return ((InternalEList<?>)getOutPorts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SensingflowPackage.SENSINGFLOW_THING__NAME:
				return getName();
			case SensingflowPackage.SENSINGFLOW_THING__LOGIC_PARAMETER:
				return getLogicParameter();
			case SensingflowPackage.SENSINGFLOW_THING__DEVICE_ID:
				return getDeviceId();
			case SensingflowPackage.SENSINGFLOW_THING__INSTANT_PARAMETER:
				return getInstantParameter();
			case SensingflowPackage.SENSINGFLOW_THING__OUT_PORTS:
				return getOutPorts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SensingflowPackage.SENSINGFLOW_THING__NAME:
				setName((String)newValue);
				return;
			case SensingflowPackage.SENSINGFLOW_THING__LOGIC_PARAMETER:
				setLogicParameter((String)newValue);
				return;
			case SensingflowPackage.SENSINGFLOW_THING__DEVICE_ID:
				setDeviceId((String)newValue);
				return;
			case SensingflowPackage.SENSINGFLOW_THING__INSTANT_PARAMETER:
				setInstantParameter((String)newValue);
				return;
			case SensingflowPackage.SENSINGFLOW_THING__OUT_PORTS:
				getOutPorts().clear();
				getOutPorts().addAll((Collection<? extends SensingflowOutPort>)newValue);
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
			case SensingflowPackage.SENSINGFLOW_THING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SensingflowPackage.SENSINGFLOW_THING__LOGIC_PARAMETER:
				setLogicParameter(LOGIC_PARAMETER_EDEFAULT);
				return;
			case SensingflowPackage.SENSINGFLOW_THING__DEVICE_ID:
				setDeviceId(DEVICE_ID_EDEFAULT);
				return;
			case SensingflowPackage.SENSINGFLOW_THING__INSTANT_PARAMETER:
				setInstantParameter(INSTANT_PARAMETER_EDEFAULT);
				return;
			case SensingflowPackage.SENSINGFLOW_THING__OUT_PORTS:
				getOutPorts().clear();
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
			case SensingflowPackage.SENSINGFLOW_THING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SensingflowPackage.SENSINGFLOW_THING__LOGIC_PARAMETER:
				return LOGIC_PARAMETER_EDEFAULT == null ? logicParameter != null : !LOGIC_PARAMETER_EDEFAULT.equals(logicParameter);
			case SensingflowPackage.SENSINGFLOW_THING__DEVICE_ID:
				return DEVICE_ID_EDEFAULT == null ? deviceId != null : !DEVICE_ID_EDEFAULT.equals(deviceId);
			case SensingflowPackage.SENSINGFLOW_THING__INSTANT_PARAMETER:
				return INSTANT_PARAMETER_EDEFAULT == null ? instantParameter != null : !INSTANT_PARAMETER_EDEFAULT.equals(instantParameter);
			case SensingflowPackage.SENSINGFLOW_THING__OUT_PORTS:
				return outPorts != null && !outPorts.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", logicParameter: ");
		result.append(logicParameter);
		result.append(", DeviceId: ");
		result.append(deviceId);
		result.append(", InstantParameter: ");
		result.append(instantParameter);
		result.append(')');
		return result.toString();
	}

} //SensingflowThingImpl
