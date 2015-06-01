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
import sensingflow.model.SensingflowInPort;
import sensingflow.model.SensingflowPackage;
import sensingflow.model.SensingflowTask;
import sensingflow.model.SensingflowTaskType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sensingflow.model.impl.SensingflowTaskImpl#getInPorts <em>In Ports</em>}</li>
 *   <li>{@link sensingflow.model.impl.SensingflowTaskImpl#getOperatorName <em>Operator Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated NOT
 */
public class SensingflowTaskImpl extends SensingflowThingImpl implements SensingflowTask {
	/**
	 * The cached value of the '{@link #getInPorts() <em>In Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<SensingflowInPort> inPorts;

	/**
	 * The default value of the '{@link #getOperatorName() <em>Operator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorName()
	 * @generated NOT
	 * @ordered 
	 */
	protected static final SensingflowTaskType OPERATOR_NAME_EDEFAULT = SensingflowTaskType.DEFAULT_TASK;
	protected SensingflowTaskType OldoperatorName = OPERATOR_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperatorName() <em>Operator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorName()
	 * @generated
	 * @ordered
	 */
	protected SensingflowTaskType operatorName = OPERATOR_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensingflowTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensingflowPackage.Literals.SENSINGFLOW_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensingflowInPort> getInPorts() {
		if (inPorts == null) {
			inPorts = new EObjectWithInverseResolvingEList<SensingflowInPort>(SensingflowInPort.class, this, SensingflowPackage.SENSINGFLOW_TASK__IN_PORTS, SensingflowPackage.SENSINGFLOW_IN_PORT__TASK);
		}
		return inPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowTaskType getOperatorName() {
		return operatorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setOperatorName(SensingflowTaskType newOperatorName) {
		// DKIM: save the old operator name
		this.OldoperatorName = operatorName;
		SensingflowTaskType oldOperatorName = operatorName;
		operatorName = newOperatorName == null ? OPERATOR_NAME_EDEFAULT : newOperatorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensingflowPackage.SENSINGFLOW_TASK__OPERATOR_NAME, oldOperatorName, operatorName));
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
			case SensingflowPackage.SENSINGFLOW_TASK__IN_PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInPorts()).basicAdd(otherEnd, msgs);
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
			case SensingflowPackage.SENSINGFLOW_TASK__IN_PORTS:
				return ((InternalEList<?>)getInPorts()).basicRemove(otherEnd, msgs);
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
			case SensingflowPackage.SENSINGFLOW_TASK__IN_PORTS:
				return getInPorts();
			case SensingflowPackage.SENSINGFLOW_TASK__OPERATOR_NAME:
				return getOperatorName();
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
			case SensingflowPackage.SENSINGFLOW_TASK__IN_PORTS:
				getInPorts().clear();
				getInPorts().addAll((Collection<? extends SensingflowInPort>)newValue);
				return;
			case SensingflowPackage.SENSINGFLOW_TASK__OPERATOR_NAME:
				setOperatorName((SensingflowTaskType)newValue);
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
			case SensingflowPackage.SENSINGFLOW_TASK__IN_PORTS:
				getInPorts().clear();
				return;
			case SensingflowPackage.SENSINGFLOW_TASK__OPERATOR_NAME:
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
			case SensingflowPackage.SENSINGFLOW_TASK__IN_PORTS:
				return inPorts != null && !inPorts.isEmpty();
			case SensingflowPackage.SENSINGFLOW_TASK__OPERATOR_NAME:
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
	public SensingflowTaskType getOldOperatorName() {
		return OldoperatorName;
	}

	@Override
	public void setOldOperatorName(SensingflowTaskType value) {
		OldoperatorName = value;		
	}

} //SensingflowTaskImpl
