/**
 */
package sensingflow.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import sensingflow.model.SensingflowOutPort;
import sensingflow.model.SensingflowPackage;
import sensingflow.model.SensingflowThing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Out Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sensingflow.model.impl.SensingflowOutPortImpl#getOutputSize <em>Output Size</em>}</li>
 *   <li>{@link sensingflow.model.impl.SensingflowOutPortImpl#getThing <em>Thing</em>}</li>
 *   <li>{@link sensingflow.model.impl.SensingflowOutPortImpl#getFrameSize <em>Frame Size</em>}</li>
 *   <li>{@link sensingflow.model.impl.SensingflowOutPortImpl#getSubFrameSize <em>Sub Frame Size</em>}</li>
 *   <li>{@link sensingflow.model.impl.SensingflowOutPortImpl#getSubFrameSlidingSize <em>Sub Frame Sliding Size</em>}</li>
 *   <li>{@link sensingflow.model.impl.SensingflowOutPortImpl#getFrameInterval <em>Frame Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SensingflowOutPortImpl extends SensingflowPortImpl implements SensingflowOutPort {
	/**
	 * The default value of the '{@link #getOutputSize() <em>Output Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputSize()
	 * @generated
	 * @ordered
	 */
	protected static final int OUTPUT_SIZE_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getOutputSize() <em>Output Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputSize()
	 * @generated
	 * @ordered
	 */
	protected int outputSize = OUTPUT_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getThing() <em>Thing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThing()
	 * @generated
	 * @ordered
	 */
	protected SensingflowThing thing;

	/**
	 * The default value of the '{@link #getFrameSize() <em>Frame Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameSize()
	 * @generated
	 * @ordered
	 */
	protected static final int FRAME_SIZE_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getFrameSize() <em>Frame Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameSize()
	 * @generated
	 * @ordered
	 */
	protected int frameSize = FRAME_SIZE_EDEFAULT;
	/**
	 * The default value of the '{@link #getSubFrameSize() <em>Sub Frame Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubFrameSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SUB_FRAME_SIZE_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getSubFrameSize() <em>Sub Frame Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubFrameSize()
	 * @generated
	 * @ordered
	 */
	protected int subFrameSize = SUB_FRAME_SIZE_EDEFAULT;
	/**
	 * The default value of the '{@link #getSubFrameSlidingSize() <em>Sub Frame Sliding Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubFrameSlidingSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SUB_FRAME_SLIDING_SIZE_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getSubFrameSlidingSize() <em>Sub Frame Sliding Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubFrameSlidingSize()
	 * @generated
	 * @ordered
	 */
	protected int subFrameSlidingSize = SUB_FRAME_SLIDING_SIZE_EDEFAULT;
	/**
	 * The default value of the '{@link #getFrameInterval() <em>Frame Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int FRAME_INTERVAL_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getFrameInterval() <em>Frame Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameInterval()
	 * @generated
	 * @ordered
	 */
	protected int frameInterval = FRAME_INTERVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensingflowOutPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensingflowPackage.Literals.SENSINGFLOW_OUT_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOutputSize() {
		return outputSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputSize(int newOutputSize) {
		int oldOutputSize = outputSize;
		outputSize = newOutputSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensingflowPackage.SENSINGFLOW_OUT_PORT__OUTPUT_SIZE, oldOutputSize, outputSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowThing getThing() {
		if (thing != null && thing.eIsProxy()) {
			InternalEObject oldThing = (InternalEObject)thing;
			thing = (SensingflowThing)eResolveProxy(oldThing);
			if (thing != oldThing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SensingflowPackage.SENSINGFLOW_OUT_PORT__THING, oldThing, thing));
			}
		}
		return thing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowThing basicGetThing() {
		return thing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThing(SensingflowThing newThing, NotificationChain msgs) {
		SensingflowThing oldThing = thing;
		thing = newThing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SensingflowPackage.SENSINGFLOW_OUT_PORT__THING, oldThing, newThing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThing(SensingflowThing newThing) {
		if (newThing != thing) {
			NotificationChain msgs = null;
			if (thing != null)
				msgs = ((InternalEObject)thing).eInverseRemove(this, SensingflowPackage.SENSINGFLOW_THING__OUT_PORTS, SensingflowThing.class, msgs);
			if (newThing != null)
				msgs = ((InternalEObject)newThing).eInverseAdd(this, SensingflowPackage.SENSINGFLOW_THING__OUT_PORTS, SensingflowThing.class, msgs);
			msgs = basicSetThing(newThing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensingflowPackage.SENSINGFLOW_OUT_PORT__THING, newThing, newThing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFrameSize() {
		return frameSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameSize(int newFrameSize) {
		int oldFrameSize = frameSize;
		frameSize = newFrameSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensingflowPackage.SENSINGFLOW_OUT_PORT__FRAME_SIZE, oldFrameSize, frameSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSubFrameSize() {
		return subFrameSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubFrameSize(int newSubFrameSize) {
		int oldSubFrameSize = subFrameSize;
		subFrameSize = newSubFrameSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensingflowPackage.SENSINGFLOW_OUT_PORT__SUB_FRAME_SIZE, oldSubFrameSize, subFrameSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSubFrameSlidingSize() {
		return subFrameSlidingSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubFrameSlidingSize(int newSubFrameSlidingSize) {
		int oldSubFrameSlidingSize = subFrameSlidingSize;
		subFrameSlidingSize = newSubFrameSlidingSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensingflowPackage.SENSINGFLOW_OUT_PORT__SUB_FRAME_SLIDING_SIZE, oldSubFrameSlidingSize, subFrameSlidingSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFrameInterval() {
		return frameInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameInterval(int newFrameInterval) {
		int oldFrameInterval = frameInterval;
		frameInterval = newFrameInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensingflowPackage.SENSINGFLOW_OUT_PORT__FRAME_INTERVAL, oldFrameInterval, frameInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__THING:
				if (thing != null)
					msgs = ((InternalEObject)thing).eInverseRemove(this, SensingflowPackage.SENSINGFLOW_THING__OUT_PORTS, SensingflowThing.class, msgs);
				return basicSetThing((SensingflowThing)otherEnd, msgs);
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
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__THING:
				return basicSetThing(null, msgs);
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
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__OUTPUT_SIZE:
				return getOutputSize();
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__THING:
				if (resolve) return getThing();
				return basicGetThing();
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__FRAME_SIZE:
				return getFrameSize();
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__SUB_FRAME_SIZE:
				return getSubFrameSize();
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__SUB_FRAME_SLIDING_SIZE:
				return getSubFrameSlidingSize();
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__FRAME_INTERVAL:
				return getFrameInterval();
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
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__OUTPUT_SIZE:
				setOutputSize((Integer)newValue);
				return;
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__THING:
				setThing((SensingflowThing)newValue);
				return;
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__FRAME_SIZE:
				setFrameSize((Integer)newValue);
				return;
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__SUB_FRAME_SIZE:
				setSubFrameSize((Integer)newValue);
				return;
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__SUB_FRAME_SLIDING_SIZE:
				setSubFrameSlidingSize((Integer)newValue);
				return;
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__FRAME_INTERVAL:
				setFrameInterval((Integer)newValue);
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
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__OUTPUT_SIZE:
				setOutputSize(OUTPUT_SIZE_EDEFAULT);
				return;
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__THING:
				setThing((SensingflowThing)null);
				return;
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__FRAME_SIZE:
				setFrameSize(FRAME_SIZE_EDEFAULT);
				return;
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__SUB_FRAME_SIZE:
				setSubFrameSize(SUB_FRAME_SIZE_EDEFAULT);
				return;
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__SUB_FRAME_SLIDING_SIZE:
				setSubFrameSlidingSize(SUB_FRAME_SLIDING_SIZE_EDEFAULT);
				return;
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__FRAME_INTERVAL:
				setFrameInterval(FRAME_INTERVAL_EDEFAULT);
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
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__OUTPUT_SIZE:
				return outputSize != OUTPUT_SIZE_EDEFAULT;
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__THING:
				return thing != null;
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__FRAME_SIZE:
				return frameSize != FRAME_SIZE_EDEFAULT;
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__SUB_FRAME_SIZE:
				return subFrameSize != SUB_FRAME_SIZE_EDEFAULT;
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__SUB_FRAME_SLIDING_SIZE:
				return subFrameSlidingSize != SUB_FRAME_SLIDING_SIZE_EDEFAULT;
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__FRAME_INTERVAL:
				return frameInterval != FRAME_INTERVAL_EDEFAULT;
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
		result.append(" (outputSize: ");
		result.append(outputSize);
		result.append(", frameSize: ");
		result.append(frameSize);
		result.append(", subFrameSize: ");
		result.append(subFrameSize);
		result.append(", subFrameSlidingSize: ");
		result.append(subFrameSlidingSize);
		result.append(", frameInterval: ");
		result.append(frameInterval);
		result.append(')');
		return result.toString();
	}

} //SensingflowOutPortImpl
