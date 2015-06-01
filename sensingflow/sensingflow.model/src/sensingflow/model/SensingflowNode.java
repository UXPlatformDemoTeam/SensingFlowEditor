/**
 */
package sensingflow.model;

import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sensingflow.model.SensingflowNode#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link sensingflow.model.SensingflowNode#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link sensingflow.model.SensingflowNode#getContainer <em>Container</em>}</li>
 *   <li>{@link sensingflow.model.SensingflowNode#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see sensingflow.model.SensingflowPackage#getSensingflowNode()
 * @model
 * @generated
 */
public interface SensingflowNode extends SensingflowContainer {
	/**
	 * Returns the value of the '<em><b>Incoming Links</b></em>' reference list.
	 * The list contents are of type {@link sensingflow.model.SensingflowLink}.
	 * It is bidirectional and its opposite is '{@link sensingflow.model.SensingflowLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Links</em>' reference list.
	 * @see sensingflow.model.SensingflowPackage#getSensingflowNode_IncomingLinks()
	 * @see sensingflow.model.SensingflowLink#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<SensingflowLink> getIncomingLinks();

	/**
	 * Returns the value of the '<em><b>Outgoing Links</b></em>' reference list.
	 * The list contents are of type {@link sensingflow.model.SensingflowLink}.
	 * It is bidirectional and its opposite is '{@link sensingflow.model.SensingflowLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Links</em>' reference list.
	 * @see sensingflow.model.SensingflowPackage#getSensingflowNode_OutgoingLinks()
	 * @see sensingflow.model.SensingflowLink#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<SensingflowLink> getOutgoingLinks();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sensingflow.model.SensingflowContainer#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(SensingflowContainer)
	 * @see sensingflow.model.SensingflowPackage#getSensingflowNode_Container()
	 * @see sensingflow.model.SensingflowContainer#getNodes
	 * @model opposite="nodes" transient="false"
	 * @generated
	 */
	SensingflowContainer getContainer();

	/**
	 * Sets the value of the '{@link sensingflow.model.SensingflowNode#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(SensingflowContainer value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' attribute.
	 * The default value is <code>"0,0,50,50"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' attribute.
	 * @see #setConstraints(Rectangle)
	 * @see sensingflow.model.SensingflowPackage#getSensingflowNode_Constraints()
	 * @model default="0,0,50,50" dataType="sensingflow.model.Rectangle"
	 * @generated
	 */
	Rectangle getConstraints();

	/**
	 * Sets the value of the '{@link sensingflow.model.SensingflowNode#getConstraints <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' attribute.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(Rectangle value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	SensingflowProcessor getProc();

} // SensingflowNode
