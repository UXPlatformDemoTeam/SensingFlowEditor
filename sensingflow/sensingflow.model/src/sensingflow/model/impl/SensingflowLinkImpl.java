/**
 */
package sensingflow.model.impl;

import java.util.Collection;

import org.eclipse.draw2d.geometry.Point;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import sensingflow.model.SensingflowLink;
import sensingflow.model.SensingflowLinkRouterKind;
import sensingflow.model.SensingflowNode;
import sensingflow.model.SensingflowPackage;
import sensingflow.model.SensingflowProcessor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sensingflow.model.impl.SensingflowLinkImpl#getProc <em>Proc</em>}</li>
 *   <li>{@link sensingflow.model.impl.SensingflowLinkImpl#getSource <em>Source</em>}</li>
 *   <li>{@link sensingflow.model.impl.SensingflowLinkImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link sensingflow.model.impl.SensingflowLinkImpl#getBendpoints <em>Bendpoints</em>}</li>
 *   <li>{@link sensingflow.model.impl.SensingflowLinkImpl#getRouterKind <em>Router Kind</em>}</li>
 *   <li>{@link sensingflow.model.impl.SensingflowLinkImpl#getWindowSize <em>Window Size</em>}</li>
 *   <li>{@link sensingflow.model.impl.SensingflowLinkImpl#getSlidingWindowSize <em>Sliding Window Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SensingflowLinkImpl extends MinimalEObjectImpl.Container implements SensingflowLink {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected SensingflowNode source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected SensingflowNode target;

	/**
	 * The cached value of the '{@link #getBendpoints() <em>Bendpoints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBendpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Point> bendpoints;

	/**
	 * The default value of the '{@link #getRouterKind() <em>Router Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouterKind()
	 * @generated
	 * @ordered
	 */
	protected static final SensingflowLinkRouterKind ROUTER_KIND_EDEFAULT = SensingflowLinkRouterKind.BENDPOINT;

	/**
	 * The cached value of the '{@link #getRouterKind() <em>Router Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouterKind()
	 * @generated
	 * @ordered
	 */
	protected SensingflowLinkRouterKind routerKind = ROUTER_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getWindowSize() <em>Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindowSize()
	 * @generated
	 * @ordered
	 */
	protected static final int WINDOW_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWindowSize() <em>Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindowSize()
	 * @generated
	 * @ordered
	 */
	protected int windowSize = WINDOW_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSlidingWindowSize() <em>Sliding Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlidingWindowSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SLIDING_WINDOW_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSlidingWindowSize() <em>Sliding Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlidingWindowSize()
	 * @generated
	 * @ordered
	 */
	protected int slidingWindowSize = SLIDING_WINDOW_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensingflowLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensingflowPackage.Literals.SENSINGFLOW_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowProcessor getProc() {
		if (eContainerFeatureID() != SensingflowPackage.SENSINGFLOW_LINK__PROC) return null;
		return (SensingflowProcessor)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProc(SensingflowProcessor newProc, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProc, SensingflowPackage.SENSINGFLOW_LINK__PROC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProc(SensingflowProcessor newProc) {
		if (newProc != eInternalContainer() || (eContainerFeatureID() != SensingflowPackage.SENSINGFLOW_LINK__PROC && newProc != null)) {
			if (EcoreUtil.isAncestor(this, newProc))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProc != null)
				msgs = ((InternalEObject)newProc).eInverseAdd(this, SensingflowPackage.SENSINGFLOW_PROCESSOR__LINKS, SensingflowProcessor.class, msgs);
			msgs = basicSetProc(newProc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensingflowPackage.SENSINGFLOW_LINK__PROC, newProc, newProc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowNode getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (SensingflowNode)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SensingflowPackage.SENSINGFLOW_LINK__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowNode basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(SensingflowNode newSource, NotificationChain msgs) {
		SensingflowNode oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SensingflowPackage.SENSINGFLOW_LINK__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(SensingflowNode newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, SensingflowPackage.SENSINGFLOW_NODE__OUTGOING_LINKS, SensingflowNode.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, SensingflowPackage.SENSINGFLOW_NODE__OUTGOING_LINKS, SensingflowNode.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensingflowPackage.SENSINGFLOW_LINK__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowNode getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (SensingflowNode)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SensingflowPackage.SENSINGFLOW_LINK__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowNode basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(SensingflowNode newTarget, NotificationChain msgs) {
		SensingflowNode oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SensingflowPackage.SENSINGFLOW_LINK__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(SensingflowNode newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, SensingflowPackage.SENSINGFLOW_NODE__INCOMING_LINKS, SensingflowNode.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, SensingflowPackage.SENSINGFLOW_NODE__INCOMING_LINKS, SensingflowNode.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensingflowPackage.SENSINGFLOW_LINK__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Point> getBendpoints() {
		if (bendpoints == null) {
			bendpoints = new EDataTypeUniqueEList<Point>(Point.class, this, SensingflowPackage.SENSINGFLOW_LINK__BENDPOINTS);
		}
		return bendpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowLinkRouterKind getRouterKind() {
		return routerKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouterKind(SensingflowLinkRouterKind newRouterKind) {
		SensingflowLinkRouterKind oldRouterKind = routerKind;
		routerKind = newRouterKind == null ? ROUTER_KIND_EDEFAULT : newRouterKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensingflowPackage.SENSINGFLOW_LINK__ROUTER_KIND, oldRouterKind, routerKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWindowSize() {
		return windowSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWindowSize(int newWindowSize) {
		int oldWindowSize = windowSize;
		windowSize = newWindowSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensingflowPackage.SENSINGFLOW_LINK__WINDOW_SIZE, oldWindowSize, windowSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSlidingWindowSize() {
		return slidingWindowSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlidingWindowSize(int newSlidingWindowSize) {
		int oldSlidingWindowSize = slidingWindowSize;
		slidingWindowSize = newSlidingWindowSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensingflowPackage.SENSINGFLOW_LINK__SLIDING_WINDOW_SIZE, oldSlidingWindowSize, slidingWindowSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SensingflowPackage.SENSINGFLOW_LINK__PROC:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProc((SensingflowProcessor)otherEnd, msgs);
			case SensingflowPackage.SENSINGFLOW_LINK__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, SensingflowPackage.SENSINGFLOW_NODE__OUTGOING_LINKS, SensingflowNode.class, msgs);
				return basicSetSource((SensingflowNode)otherEnd, msgs);
			case SensingflowPackage.SENSINGFLOW_LINK__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, SensingflowPackage.SENSINGFLOW_NODE__INCOMING_LINKS, SensingflowNode.class, msgs);
				return basicSetTarget((SensingflowNode)otherEnd, msgs);
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
			case SensingflowPackage.SENSINGFLOW_LINK__PROC:
				return basicSetProc(null, msgs);
			case SensingflowPackage.SENSINGFLOW_LINK__SOURCE:
				return basicSetSource(null, msgs);
			case SensingflowPackage.SENSINGFLOW_LINK__TARGET:
				return basicSetTarget(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SensingflowPackage.SENSINGFLOW_LINK__PROC:
				return eInternalContainer().eInverseRemove(this, SensingflowPackage.SENSINGFLOW_PROCESSOR__LINKS, SensingflowProcessor.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SensingflowPackage.SENSINGFLOW_LINK__PROC:
				return getProc();
			case SensingflowPackage.SENSINGFLOW_LINK__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case SensingflowPackage.SENSINGFLOW_LINK__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case SensingflowPackage.SENSINGFLOW_LINK__BENDPOINTS:
				return getBendpoints();
			case SensingflowPackage.SENSINGFLOW_LINK__ROUTER_KIND:
				return getRouterKind();
			case SensingflowPackage.SENSINGFLOW_LINK__WINDOW_SIZE:
				return getWindowSize();
			case SensingflowPackage.SENSINGFLOW_LINK__SLIDING_WINDOW_SIZE:
				return getSlidingWindowSize();
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
			case SensingflowPackage.SENSINGFLOW_LINK__PROC:
				setProc((SensingflowProcessor)newValue);
				return;
			case SensingflowPackage.SENSINGFLOW_LINK__SOURCE:
				setSource((SensingflowNode)newValue);
				return;
			case SensingflowPackage.SENSINGFLOW_LINK__TARGET:
				setTarget((SensingflowNode)newValue);
				return;
			case SensingflowPackage.SENSINGFLOW_LINK__BENDPOINTS:
				getBendpoints().clear();
				getBendpoints().addAll((Collection<? extends Point>)newValue);
				return;
			case SensingflowPackage.SENSINGFLOW_LINK__ROUTER_KIND:
				setRouterKind((SensingflowLinkRouterKind)newValue);
				return;
			case SensingflowPackage.SENSINGFLOW_LINK__WINDOW_SIZE:
				setWindowSize((Integer)newValue);
				return;
			case SensingflowPackage.SENSINGFLOW_LINK__SLIDING_WINDOW_SIZE:
				setSlidingWindowSize((Integer)newValue);
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
			case SensingflowPackage.SENSINGFLOW_LINK__PROC:
				setProc((SensingflowProcessor)null);
				return;
			case SensingflowPackage.SENSINGFLOW_LINK__SOURCE:
				setSource((SensingflowNode)null);
				return;
			case SensingflowPackage.SENSINGFLOW_LINK__TARGET:
				setTarget((SensingflowNode)null);
				return;
			case SensingflowPackage.SENSINGFLOW_LINK__BENDPOINTS:
				getBendpoints().clear();
				return;
			case SensingflowPackage.SENSINGFLOW_LINK__ROUTER_KIND:
				setRouterKind(ROUTER_KIND_EDEFAULT);
				return;
			case SensingflowPackage.SENSINGFLOW_LINK__WINDOW_SIZE:
				setWindowSize(WINDOW_SIZE_EDEFAULT);
				return;
			case SensingflowPackage.SENSINGFLOW_LINK__SLIDING_WINDOW_SIZE:
				setSlidingWindowSize(SLIDING_WINDOW_SIZE_EDEFAULT);
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
			case SensingflowPackage.SENSINGFLOW_LINK__PROC:
				return getProc() != null;
			case SensingflowPackage.SENSINGFLOW_LINK__SOURCE:
				return source != null;
			case SensingflowPackage.SENSINGFLOW_LINK__TARGET:
				return target != null;
			case SensingflowPackage.SENSINGFLOW_LINK__BENDPOINTS:
				return bendpoints != null && !bendpoints.isEmpty();
			case SensingflowPackage.SENSINGFLOW_LINK__ROUTER_KIND:
				return routerKind != ROUTER_KIND_EDEFAULT;
			case SensingflowPackage.SENSINGFLOW_LINK__WINDOW_SIZE:
				return windowSize != WINDOW_SIZE_EDEFAULT;
			case SensingflowPackage.SENSINGFLOW_LINK__SLIDING_WINDOW_SIZE:
				return slidingWindowSize != SLIDING_WINDOW_SIZE_EDEFAULT;
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
		result.append(" (bendpoints: ");
		result.append(bendpoints);
		result.append(", routerKind: ");
		result.append(routerKind);
		result.append(", windowSize: ");
		result.append(windowSize);
		result.append(", slidingWindowSize: ");
		result.append(slidingWindowSize);
		result.append(')');
		return result.toString();
	}

} //SensingflowLinkImpl
