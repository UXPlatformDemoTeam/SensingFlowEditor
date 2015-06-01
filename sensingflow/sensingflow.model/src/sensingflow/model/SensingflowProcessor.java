/**
 */
package sensingflow.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sensingflow.model.SensingflowProcessor#getLinks <em>Links</em>}</li>
 *   <li>{@link sensingflow.model.SensingflowProcessor#getContextType <em>Context Type</em>}</li>
 *   <li>{@link sensingflow.model.SensingflowProcessor#getError <em>Error</em>}</li>
 *   <li>{@link sensingflow.model.SensingflowProcessor#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see sensingflow.model.SensingflowPackage#getSensingflowProcessor()
 * @model
 * @generated
 */
public interface SensingflowProcessor extends SensingflowContainer {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link sensingflow.model.SensingflowLink}.
	 * It is bidirectional and its opposite is '{@link sensingflow.model.SensingflowLink#getProc <em>Proc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see sensingflow.model.SensingflowPackage#getSensingflowProcessor_Links()
	 * @see sensingflow.model.SensingflowLink#getProc
	 * @model opposite="proc" containment="true"
	 * @generated
	 */
	EList<SensingflowLink> getLinks();

	/**
	 * Returns the value of the '<em><b>Context Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Type</em>' attribute.
	 * @see sensingflow.model.SensingflowPackage#getSensingflowProcessor_ContextType()
	 * @model required="true" changeable="false" ordered="false"
	 * @generated
	 */
	String getContextType();

	/**
	 * Returns the value of the '<em><b>Error</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' attribute.
	 * @see #setError(float)
	 * @see sensingflow.model.SensingflowPackage#getSensingflowProcessor_Error()
	 * @model default="0.1" unique="false" required="true" ordered="false"
	 * @generated
	 */
	float getError();

	/**
	 * Sets the value of the '{@link sensingflow.model.SensingflowProcessor#getError <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' attribute.
	 * @see #getError()
	 * @generated
	 */
	void setError(float value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute.
	 * @see #setValues(String)
	 * @see sensingflow.model.SensingflowPackage#getSensingflowProcessor_Values()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getValues();

	/**
	 * Sets the value of the '{@link sensingflow.model.SensingflowProcessor#getValues <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values</em>' attribute.
	 * @see #getValues()
	 * @generated
	 */
	void setValues(String value);

} // SensingflowProcessor
