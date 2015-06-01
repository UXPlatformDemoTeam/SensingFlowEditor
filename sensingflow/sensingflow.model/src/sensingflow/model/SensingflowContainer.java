/**
 */
package sensingflow.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sensingflow.model.SensingflowContainer#getNodes <em>Nodes</em>}</li>
 *   <li>{@link sensingflow.model.SensingflowContainer#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see sensingflow.model.SensingflowPackage#getSensingflowContainer()
 * @model
 * @generated
 */
public interface SensingflowContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link sensingflow.model.SensingflowNode}.
	 * It is bidirectional and its opposite is '{@link sensingflow.model.SensingflowNode#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see sensingflow.model.SensingflowPackage#getSensingflowContainer_Nodes()
	 * @see sensingflow.model.SensingflowNode#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<SensingflowNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see sensingflow.model.SensingflowPackage#getSensingflowContainer_Id()
	 * @model id="true" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	int getId();

} // SensingflowContainer
