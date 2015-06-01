/**
 */
package sensingflow.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Out Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sensingflow.model.SensingflowOutPort#getOutputSize <em>Output Size</em>}</li>
 *   <li>{@link sensingflow.model.SensingflowOutPort#getThing <em>Thing</em>}</li>
 *   <li>{@link sensingflow.model.SensingflowOutPort#getFrameSize <em>Frame Size</em>}</li>
 *   <li>{@link sensingflow.model.SensingflowOutPort#getSubFrameSize <em>Sub Frame Size</em>}</li>
 *   <li>{@link sensingflow.model.SensingflowOutPort#getSubFrameSlidingSize <em>Sub Frame Sliding Size</em>}</li>
 *   <li>{@link sensingflow.model.SensingflowOutPort#getFrameInterval <em>Frame Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @see sensingflow.model.SensingflowPackage#getSensingflowOutPort()
 * @model
 * @generated
 */
public interface SensingflowOutPort extends SensingflowPort {

	/**
	 * Returns the value of the '<em><b>Output Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Size</em>' attribute.
	 * @see #setOutputSize(int)
	 * @see sensingflow.model.SensingflowPackage#getSensingflowOutPort_OutputSize()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getOutputSize();

	/**
	 * Sets the value of the '{@link sensingflow.model.SensingflowOutPort#getOutputSize <em>Output Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Size</em>' attribute.
	 * @see #getOutputSize()
	 * @generated
	 */
	void setOutputSize(int value);

	/**
	 * Returns the value of the '<em><b>Thing</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sensingflow.model.SensingflowThing#getOutPorts <em>Out Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thing</em>' reference.
	 * @see #setThing(SensingflowThing)
	 * @see sensingflow.model.SensingflowPackage#getSensingflowOutPort_Thing()
	 * @see sensingflow.model.SensingflowThing#getOutPorts
	 * @model opposite="outPorts"
	 * @generated
	 */
	SensingflowThing getThing();

	/**
	 * Sets the value of the '{@link sensingflow.model.SensingflowOutPort#getThing <em>Thing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thing</em>' reference.
	 * @see #getThing()
	 * @generated
	 */
	void setThing(SensingflowThing value);

	/**
	 * Returns the value of the '<em><b>Frame Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame Size</em>' attribute.
	 * @see #setFrameSize(int)
	 * @see sensingflow.model.SensingflowPackage#getSensingflowOutPort_FrameSize()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getFrameSize();

	/**
	 * Sets the value of the '{@link sensingflow.model.SensingflowOutPort#getFrameSize <em>Frame Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Size</em>' attribute.
	 * @see #getFrameSize()
	 * @generated
	 */
	void setFrameSize(int value);

	/**
	 * Returns the value of the '<em><b>Sub Frame Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Frame Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Frame Size</em>' attribute.
	 * @see #setSubFrameSize(int)
	 * @see sensingflow.model.SensingflowPackage#getSensingflowOutPort_SubFrameSize()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	int getSubFrameSize();

	/**
	 * Sets the value of the '{@link sensingflow.model.SensingflowOutPort#getSubFrameSize <em>Sub Frame Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Frame Size</em>' attribute.
	 * @see #getSubFrameSize()
	 * @generated
	 */
	void setSubFrameSize(int value);

	/**
	 * Returns the value of the '<em><b>Sub Frame Sliding Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Frame Sliding Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Frame Sliding Size</em>' attribute.
	 * @see #setSubFrameSlidingSize(int)
	 * @see sensingflow.model.SensingflowPackage#getSensingflowOutPort_SubFrameSlidingSize()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	int getSubFrameSlidingSize();

	/**
	 * Sets the value of the '{@link sensingflow.model.SensingflowOutPort#getSubFrameSlidingSize <em>Sub Frame Sliding Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Frame Sliding Size</em>' attribute.
	 * @see #getSubFrameSlidingSize()
	 * @generated
	 */
	void setSubFrameSlidingSize(int value);

	/**
	 * Returns the value of the '<em><b>Frame Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame Interval</em>' attribute.
	 * @see #setFrameInterval(int)
	 * @see sensingflow.model.SensingflowPackage#getSensingflowOutPort_FrameInterval()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	int getFrameInterval();

	/**
	 * Sets the value of the '{@link sensingflow.model.SensingflowOutPort#getFrameInterval <em>Frame Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Interval</em>' attribute.
	 * @see #getFrameInterval()
	 * @generated
	 */
	void setFrameInterval(int value);
} // SensingflowOutPort
