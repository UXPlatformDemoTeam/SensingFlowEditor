/**
 */
package sensingflow.model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import sensingflow.model.SensingflowContainer;
import sensingflow.model.SensingflowFactory;
import sensingflow.model.SensingflowLink;
import sensingflow.model.SensingflowNode;
import sensingflow.model.SensingflowPackage;
import sensingflow.model.SensingflowProcessor;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sensingflow.model.impl.SensingflowNodeImpl#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link sensingflow.model.impl.SensingflowNodeImpl#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link sensingflow.model.impl.SensingflowNodeImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link sensingflow.model.impl.SensingflowNodeImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SensingflowNodeImpl extends SensingflowContainerImpl implements
		SensingflowNode {
	/**
	 * The cached value of the '{@link #getIncomingLinks() <em>Incoming Links</em>}' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getIncomingLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<SensingflowLink> incomingLinks;

	/**
	 * The cached value of the '{@link #getOutgoingLinks() <em>Outgoing Links</em>}' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getOutgoingLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<SensingflowLink> outgoingLinks;

	/**
	 * The default value of the '{@link #getConstraints() <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected static final Rectangle CONSTRAINTS_EDEFAULT = (Rectangle)SensingflowFactory.eINSTANCE.createFromString(SensingflowPackage.eINSTANCE.getRectangle(), "0,0,50,50");

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected Rectangle constraints = CONSTRAINTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SensingflowNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensingflowPackage.Literals.SENSINGFLOW_NODE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensingflowLink> getIncomingLinks() {
		if (incomingLinks == null) {
			incomingLinks = new EObjectWithInverseResolvingEList<SensingflowLink>(SensingflowLink.class, this, SensingflowPackage.SENSINGFLOW_NODE__INCOMING_LINKS, SensingflowPackage.SENSINGFLOW_LINK__TARGET);
		}
		return incomingLinks;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensingflowLink> getOutgoingLinks() {
		if (outgoingLinks == null) {
			outgoingLinks = new EObjectWithInverseResolvingEList<SensingflowLink>(SensingflowLink.class, this, SensingflowPackage.SENSINGFLOW_NODE__OUTGOING_LINKS, SensingflowPackage.SENSINGFLOW_LINK__SOURCE);
		}
		return outgoingLinks;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowContainer getContainer() {
		if (eContainerFeatureID() != SensingflowPackage.SENSINGFLOW_NODE__CONTAINER) return null;
		return (SensingflowContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(
			SensingflowContainer newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, SensingflowPackage.SENSINGFLOW_NODE__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(SensingflowContainer newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != SensingflowPackage.SENSINGFLOW_NODE__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, SensingflowPackage.SENSINGFLOW_CONTAINER__NODES, SensingflowContainer.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensingflowPackage.SENSINGFLOW_NODE__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Rectangle getConstraints() {
		return constraints;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraints(Rectangle newConstraints) {
		Rectangle oldConstraints = constraints;
		constraints = newConstraints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensingflowPackage.SENSINGFLOW_NODE__CONSTRAINTS, oldConstraints, constraints));
	}



	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public SensingflowProcessor getProc() {
		SensingflowContainer currentContainer = getContainer();
		while (!(currentContainer instanceof SensingflowProcessor)) {
			// the container must be a node.
			SensingflowNode containerNode = (SensingflowNode) getContainer();
			currentContainer = containerNode.getContainer();
		}

		return (SensingflowProcessor) currentContainer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SensingflowPackage.SENSINGFLOW_NODE__INCOMING_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingLinks()).basicAdd(otherEnd, msgs);
			case SensingflowPackage.SENSINGFLOW_NODE__OUTGOING_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingLinks()).basicAdd(otherEnd, msgs);
			case SensingflowPackage.SENSINGFLOW_NODE__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((SensingflowContainer)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SensingflowPackage.SENSINGFLOW_NODE__INCOMING_LINKS:
				return ((InternalEList<?>)getIncomingLinks()).basicRemove(otherEnd, msgs);
			case SensingflowPackage.SENSINGFLOW_NODE__OUTGOING_LINKS:
				return ((InternalEList<?>)getOutgoingLinks()).basicRemove(otherEnd, msgs);
			case SensingflowPackage.SENSINGFLOW_NODE__CONTAINER:
				return basicSetContainer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SensingflowPackage.SENSINGFLOW_NODE__CONTAINER:
				return eInternalContainer().eInverseRemove(this, SensingflowPackage.SENSINGFLOW_CONTAINER__NODES, SensingflowContainer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SensingflowPackage.SENSINGFLOW_NODE__INCOMING_LINKS:
				return getIncomingLinks();
			case SensingflowPackage.SENSINGFLOW_NODE__OUTGOING_LINKS:
				return getOutgoingLinks();
			case SensingflowPackage.SENSINGFLOW_NODE__CONTAINER:
				return getContainer();
			case SensingflowPackage.SENSINGFLOW_NODE__CONSTRAINTS:
				return getConstraints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SensingflowPackage.SENSINGFLOW_NODE__INCOMING_LINKS:
				getIncomingLinks().clear();
				getIncomingLinks().addAll((Collection<? extends SensingflowLink>)newValue);
				return;
			case SensingflowPackage.SENSINGFLOW_NODE__OUTGOING_LINKS:
				getOutgoingLinks().clear();
				getOutgoingLinks().addAll((Collection<? extends SensingflowLink>)newValue);
				return;
			case SensingflowPackage.SENSINGFLOW_NODE__CONTAINER:
				setContainer((SensingflowContainer)newValue);
				return;
			case SensingflowPackage.SENSINGFLOW_NODE__CONSTRAINTS:
				setConstraints((Rectangle)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SensingflowPackage.SENSINGFLOW_NODE__INCOMING_LINKS:
				getIncomingLinks().clear();
				return;
			case SensingflowPackage.SENSINGFLOW_NODE__OUTGOING_LINKS:
				getOutgoingLinks().clear();
				return;
			case SensingflowPackage.SENSINGFLOW_NODE__CONTAINER:
				setContainer((SensingflowContainer)null);
				return;
			case SensingflowPackage.SENSINGFLOW_NODE__CONSTRAINTS:
				setConstraints(CONSTRAINTS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SensingflowPackage.SENSINGFLOW_NODE__INCOMING_LINKS:
				return incomingLinks != null && !incomingLinks.isEmpty();
			case SensingflowPackage.SENSINGFLOW_NODE__OUTGOING_LINKS:
				return outgoingLinks != null && !outgoingLinks.isEmpty();
			case SensingflowPackage.SENSINGFLOW_NODE__CONTAINER:
				return getContainer() != null;
			case SensingflowPackage.SENSINGFLOW_NODE__CONSTRAINTS:
				return CONSTRAINTS_EDEFAULT == null ? constraints != null : !CONSTRAINTS_EDEFAULT.equals(constraints);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case SensingflowPackage.SENSINGFLOW_NODE___GET_PROC:
				return getProc();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (constraints: ");
		result.append(constraints);
		result.append(')');
		return result.toString();
	}

} // SensingflowNodeImpl
