/**
 */
package sensingflow.model;

import org.eclipse.draw2d.geometry.Point;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sensingflow.model.SensingflowLink#getProc <em>Proc</em>}</li>
 *   <li>{@link sensingflow.model.SensingflowLink#getSource <em>Source</em>}</li>
 *   <li>{@link sensingflow.model.SensingflowLink#getTarget <em>Target</em>}</li>
 *   <li>{@link sensingflow.model.SensingflowLink#getBendpoints <em>Bendpoints</em>}</li>
 *   <li>{@link sensingflow.model.SensingflowLink#getRouterKind <em>Router Kind</em>}</li>
 *   <li>{@link sensingflow.model.SensingflowLink#getWindowSize <em>Window Size</em>}</li>
 *   <li>{@link sensingflow.model.SensingflowLink#getSlidingWindowSize <em>Sliding Window Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see sensingflow.model.SensingflowPackage#getSensingflowLink()
 * @model
 * @generated
 */
public interface SensingflowLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Proc</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sensingflow.model.SensingflowProcessor#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proc</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proc</em>' container reference.
	 * @see #setProc(SensingflowProcessor)
	 * @see sensingflow.model.SensingflowPackage#getSensingflowLink_Proc()
	 * @see sensingflow.model.SensingflowProcessor#getLinks
	 * @model opposite="links" transient="false"
	 * @generated
	 */
	SensingflowProcessor getProc();

	/**
	 * Sets the value of the '{@link sensingflow.model.SensingflowLink#getProc <em>Proc</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proc</em>' container reference.
	 * @see #getProc()
	 * @generated
	 */
	void setProc(SensingflowProcessor value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sensingflow.model.SensingflowNode#getOutgoingLinks <em>Outgoing Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(SensingflowNode)
	 * @see sensingflow.model.SensingflowPackage#getSensingflowLink_Source()
	 * @see sensingflow.model.SensingflowNode#getOutgoingLinks
	 * @model opposite="outgoingLinks"
	 * @generated
	 */
	SensingflowNode getSource();

	/**
	 * Sets the value of the '{@link sensingflow.model.SensingflowLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SensingflowNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sensingflow.model.SensingflowNode#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(SensingflowNode)
	 * @see sensingflow.model.SensingflowPackage#getSensingflowLink_Target()
	 * @see sensingflow.model.SensingflowNode#getIncomingLinks
	 * @model opposite="incomingLinks"
	 * @generated
	 */
	SensingflowNode getTarget();

	/**
	 * Sets the value of the '{@link sensingflow.model.SensingflowLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(SensingflowNode value);

	/**
	 * Returns the value of the '<em><b>Bendpoints</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.draw2d.geometry.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bendpoints</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bendpoints</em>' attribute list.
	 * @see sensingflow.model.SensingflowPackage#getSensingflowLink_Bendpoints()
	 * @model dataType="sensingflow.model.Point"
	 * @generated
	 */
	EList<Point> getBendpoints();

	/**
	 * Returns the value of the '<em><b>Router Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link sensingflow.model.SensingflowLinkRouterKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Router Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Router Kind</em>' attribute.
	 * @see sensingflow.model.SensingflowLinkRouterKind
	 * @see #setRouterKind(SensingflowLinkRouterKind)
	 * @see sensingflow.model.SensingflowPackage#getSensingflowLink_RouterKind()
	 * @model
	 * @generated
	 */
	SensingflowLinkRouterKind getRouterKind();

	/**
	 * Sets the value of the '{@link sensingflow.model.SensingflowLink#getRouterKind <em>Router Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Router Kind</em>' attribute.
	 * @see sensingflow.model.SensingflowLinkRouterKind
	 * @see #getRouterKind()
	 * @generated
	 */
	void setRouterKind(SensingflowLinkRouterKind value);

	/**
	 * Returns the value of the '<em><b>Window Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Window Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window Size</em>' attribute.
	 * @see #setWindowSize(int)
	 * @see sensingflow.model.SensingflowPackage#getSensingflowLink_WindowSize()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getWindowSize();

	/**
	 * Sets the value of the '{@link sensingflow.model.SensingflowLink#getWindowSize <em>Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window Size</em>' attribute.
	 * @see #getWindowSize()
	 * @generated
	 */
	void setWindowSize(int value);

	/**
	 * Returns the value of the '<em><b>Sliding Window Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sliding Window Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sliding Window Size</em>' attribute.
	 * @see #setSlidingWindowSize(int)
	 * @see sensingflow.model.SensingflowPackage#getSensingflowLink_SlidingWindowSize()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getSlidingWindowSize();

	/**
	 * Sets the value of the '{@link sensingflow.model.SensingflowLink#getSlidingWindowSize <em>Sliding Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sliding Window Size</em>' attribute.
	 * @see #getSlidingWindowSize()
	 * @generated
	 */
	void setSlidingWindowSize(int value);

} // SensingflowLink
