/**
 */
package sensingflow.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sensingflow.model.SensingflowFactory
 * @model kind="package"
 * @generated
 */
public interface SensingflowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sensingflow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "sensingflow.kaist";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sensingflow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SensingflowPackage eINSTANCE = sensingflow.model.impl.SensingflowPackageImpl.init();

	/**
	 * The meta object id for the '{@link sensingflow.model.impl.SensingflowContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensingflow.model.impl.SensingflowContainerImpl
	 * @see sensingflow.model.impl.SensingflowPackageImpl#getSensingflowContainer()
	 * @generated
	 */
	int SENSINGFLOW_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_CONTAINER__NODES = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_CONTAINER__ID = 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sensingflow.model.impl.SensingflowProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensingflow.model.impl.SensingflowProcessorImpl
	 * @see sensingflow.model.impl.SensingflowPackageImpl#getSensingflowProcessor()
	 * @generated
	 */
	int SENSINGFLOW_PROCESSOR = 1;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_PROCESSOR__NODES = SENSINGFLOW_CONTAINER__NODES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_PROCESSOR__ID = SENSINGFLOW_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_PROCESSOR__LINKS = SENSINGFLOW_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_PROCESSOR__CONTEXT_TYPE = SENSINGFLOW_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_PROCESSOR__ERROR = SENSINGFLOW_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_PROCESSOR__VALUES = SENSINGFLOW_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_PROCESSOR_FEATURE_COUNT = SENSINGFLOW_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_PROCESSOR_OPERATION_COUNT = SENSINGFLOW_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensingflow.model.impl.SensingflowNodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensingflow.model.impl.SensingflowNodeImpl
	 * @see sensingflow.model.impl.SensingflowPackageImpl#getSensingflowNode()
	 * @generated
	 */
	int SENSINGFLOW_NODE = 2;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_NODE__NODES = SENSINGFLOW_CONTAINER__NODES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_NODE__ID = SENSINGFLOW_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_NODE__INCOMING_LINKS = SENSINGFLOW_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_NODE__OUTGOING_LINKS = SENSINGFLOW_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_NODE__CONTAINER = SENSINGFLOW_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_NODE__CONSTRAINTS = SENSINGFLOW_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_NODE_FEATURE_COUNT = SENSINGFLOW_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Proc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_NODE___GET_PROC = SENSINGFLOW_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_NODE_OPERATION_COUNT = SENSINGFLOW_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link sensingflow.model.impl.SensingflowThingImpl <em>Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensingflow.model.impl.SensingflowThingImpl
	 * @see sensingflow.model.impl.SensingflowPackageImpl#getSensingflowThing()
	 * @generated
	 */
	int SENSINGFLOW_THING = 3;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_THING__NODES = SENSINGFLOW_NODE__NODES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_THING__ID = SENSINGFLOW_NODE__ID;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_THING__INCOMING_LINKS = SENSINGFLOW_NODE__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_THING__OUTGOING_LINKS = SENSINGFLOW_NODE__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_THING__CONTAINER = SENSINGFLOW_NODE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_THING__CONSTRAINTS = SENSINGFLOW_NODE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_THING__NAME = SENSINGFLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logic Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_THING__LOGIC_PARAMETER = SENSINGFLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Device Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_THING__DEVICE_ID = SENSINGFLOW_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Instant Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_THING__INSTANT_PARAMETER = SENSINGFLOW_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_THING__OUT_PORTS = SENSINGFLOW_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_THING_FEATURE_COUNT = SENSINGFLOW_NODE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Proc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_THING___GET_PROC = SENSINGFLOW_NODE___GET_PROC;

	/**
	 * The number of operations of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_THING_OPERATION_COUNT = SENSINGFLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensingflow.model.impl.SensingflowSensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensingflow.model.impl.SensingflowSensorImpl
	 * @see sensingflow.model.impl.SensingflowPackageImpl#getSensingflowSensor()
	 * @generated
	 */
	int SENSINGFLOW_SENSOR = 4;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_SENSOR__NODES = SENSINGFLOW_THING__NODES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_SENSOR__ID = SENSINGFLOW_THING__ID;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_SENSOR__INCOMING_LINKS = SENSINGFLOW_THING__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_SENSOR__OUTGOING_LINKS = SENSINGFLOW_THING__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_SENSOR__CONTAINER = SENSINGFLOW_THING__CONTAINER;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_SENSOR__CONSTRAINTS = SENSINGFLOW_THING__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_SENSOR__NAME = SENSINGFLOW_THING__NAME;

	/**
	 * The feature id for the '<em><b>Logic Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_SENSOR__LOGIC_PARAMETER = SENSINGFLOW_THING__LOGIC_PARAMETER;

	/**
	 * The feature id for the '<em><b>Device Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_SENSOR__DEVICE_ID = SENSINGFLOW_THING__DEVICE_ID;

	/**
	 * The feature id for the '<em><b>Instant Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_SENSOR__INSTANT_PARAMETER = SENSINGFLOW_THING__INSTANT_PARAMETER;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_SENSOR__OUT_PORTS = SENSINGFLOW_THING__OUT_PORTS;

	/**
	 * The feature id for the '<em><b>Operator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_SENSOR__OPERATOR_NAME = SENSINGFLOW_THING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_SENSOR_FEATURE_COUNT = SENSINGFLOW_THING_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Proc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_SENSOR___GET_PROC = SENSINGFLOW_THING___GET_PROC;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_SENSOR_OPERATION_COUNT = SENSINGFLOW_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensingflow.model.impl.SensingflowTaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensingflow.model.impl.SensingflowTaskImpl
	 * @see sensingflow.model.impl.SensingflowPackageImpl#getSensingflowTask()
	 * @generated
	 */
	int SENSINGFLOW_TASK = 5;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_TASK__NODES = SENSINGFLOW_THING__NODES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_TASK__ID = SENSINGFLOW_THING__ID;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_TASK__INCOMING_LINKS = SENSINGFLOW_THING__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_TASK__OUTGOING_LINKS = SENSINGFLOW_THING__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_TASK__CONTAINER = SENSINGFLOW_THING__CONTAINER;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_TASK__CONSTRAINTS = SENSINGFLOW_THING__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_TASK__NAME = SENSINGFLOW_THING__NAME;

	/**
	 * The feature id for the '<em><b>Logic Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_TASK__LOGIC_PARAMETER = SENSINGFLOW_THING__LOGIC_PARAMETER;

	/**
	 * The feature id for the '<em><b>Device Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_TASK__DEVICE_ID = SENSINGFLOW_THING__DEVICE_ID;

	/**
	 * The feature id for the '<em><b>Instant Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_TASK__INSTANT_PARAMETER = SENSINGFLOW_THING__INSTANT_PARAMETER;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_TASK__OUT_PORTS = SENSINGFLOW_THING__OUT_PORTS;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_TASK__IN_PORTS = SENSINGFLOW_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_TASK__OPERATOR_NAME = SENSINGFLOW_THING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_TASK_FEATURE_COUNT = SENSINGFLOW_THING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Proc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_TASK___GET_PROC = SENSINGFLOW_THING___GET_PROC;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_TASK_OPERATION_COUNT = SENSINGFLOW_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensingflow.model.impl.SensingflowLinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensingflow.model.impl.SensingflowLinkImpl
	 * @see sensingflow.model.impl.SensingflowPackageImpl#getSensingflowLink()
	 * @generated
	 */
	int SENSINGFLOW_LINK = 6;

	/**
	 * The feature id for the '<em><b>Proc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_LINK__PROC = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_LINK__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_LINK__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_LINK__BENDPOINTS = 3;

	/**
	 * The feature id for the '<em><b>Router Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_LINK__ROUTER_KIND = 4;

	/**
	 * The feature id for the '<em><b>Window Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_LINK__WINDOW_SIZE = 5;

	/**
	 * The feature id for the '<em><b>Sliding Window Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_LINK__SLIDING_WINDOW_SIZE = 6;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_LINK_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sensingflow.model.impl.SensingflowPortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensingflow.model.impl.SensingflowPortImpl
	 * @see sensingflow.model.impl.SensingflowPackageImpl#getSensingflowPort()
	 * @generated
	 */
	int SENSINGFLOW_PORT = 7;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_PORT__NODES = SENSINGFLOW_NODE__NODES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_PORT__ID = SENSINGFLOW_NODE__ID;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_PORT__INCOMING_LINKS = SENSINGFLOW_NODE__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_PORT__OUTGOING_LINKS = SENSINGFLOW_NODE__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_PORT__CONTAINER = SENSINGFLOW_NODE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_PORT__CONSTRAINTS = SENSINGFLOW_NODE__CONSTRAINTS;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_PORT_FEATURE_COUNT = SENSINGFLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Proc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_PORT___GET_PROC = SENSINGFLOW_NODE___GET_PROC;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_PORT_OPERATION_COUNT = SENSINGFLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensingflow.model.impl.SensingflowInPortImpl <em>In Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensingflow.model.impl.SensingflowInPortImpl
	 * @see sensingflow.model.impl.SensingflowPackageImpl#getSensingflowInPort()
	 * @generated
	 */
	int SENSINGFLOW_IN_PORT = 8;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_IN_PORT__NODES = SENSINGFLOW_PORT__NODES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_IN_PORT__ID = SENSINGFLOW_PORT__ID;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_IN_PORT__INCOMING_LINKS = SENSINGFLOW_PORT__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_IN_PORT__OUTGOING_LINKS = SENSINGFLOW_PORT__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_IN_PORT__CONTAINER = SENSINGFLOW_PORT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_IN_PORT__CONSTRAINTS = SENSINGFLOW_PORT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_IN_PORT__TASK = SENSINGFLOW_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>In Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_IN_PORT_FEATURE_COUNT = SENSINGFLOW_PORT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Proc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_IN_PORT___GET_PROC = SENSINGFLOW_PORT___GET_PROC;

	/**
	 * The number of operations of the '<em>In Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_IN_PORT_OPERATION_COUNT = SENSINGFLOW_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensingflow.model.impl.SensingflowOutPortImpl <em>Out Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensingflow.model.impl.SensingflowOutPortImpl
	 * @see sensingflow.model.impl.SensingflowPackageImpl#getSensingflowOutPort()
	 * @generated
	 */
	int SENSINGFLOW_OUT_PORT = 9;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_OUT_PORT__NODES = SENSINGFLOW_PORT__NODES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_OUT_PORT__ID = SENSINGFLOW_PORT__ID;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_OUT_PORT__INCOMING_LINKS = SENSINGFLOW_PORT__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_OUT_PORT__OUTGOING_LINKS = SENSINGFLOW_PORT__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_OUT_PORT__CONTAINER = SENSINGFLOW_PORT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_OUT_PORT__CONSTRAINTS = SENSINGFLOW_PORT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Output Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_OUT_PORT__OUTPUT_SIZE = SENSINGFLOW_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Thing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_OUT_PORT__THING = SENSINGFLOW_PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Frame Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_OUT_PORT__FRAME_SIZE = SENSINGFLOW_PORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Frame Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_OUT_PORT__SUB_FRAME_SIZE = SENSINGFLOW_PORT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sub Frame Sliding Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_OUT_PORT__SUB_FRAME_SLIDING_SIZE = SENSINGFLOW_PORT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Frame Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_OUT_PORT__FRAME_INTERVAL = SENSINGFLOW_PORT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Out Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_OUT_PORT_FEATURE_COUNT = SENSINGFLOW_PORT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Proc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_OUT_PORT___GET_PROC = SENSINGFLOW_PORT___GET_PROC;

	/**
	 * The number of operations of the '<em>Out Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSINGFLOW_OUT_PORT_OPERATION_COUNT = SENSINGFLOW_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensingflow.model.SensingflowLinkRouterKind <em>Link Router Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensingflow.model.SensingflowLinkRouterKind
	 * @see sensingflow.model.impl.SensingflowPackageImpl#getSensingflowLinkRouterKind()
	 * @generated
	 */
	int SENSINGFLOW_LINK_ROUTER_KIND = 10;

	/**
	 * The meta object id for the '{@link sensingflow.model.SensingflowSensorType <em>Sensor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensingflow.model.SensingflowSensorType
	 * @see sensingflow.model.impl.SensingflowPackageImpl#getSensingflowSensorType()
	 * @generated
	 */
	int SENSINGFLOW_SENSOR_TYPE = 11;

	/**
	 * The meta object id for the '{@link sensingflow.model.SensingflowTaskType <em>Task Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensingflow.model.SensingflowTaskType
	 * @see sensingflow.model.impl.SensingflowPackageImpl#getSensingflowTaskType()
	 * @generated
	 */
	int SENSINGFLOW_TASK_TYPE = 12;

	/**
	 * The meta object id for the '<em>Point</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Point
	 * @see sensingflow.model.impl.SensingflowPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 13;

	/**
	 * The meta object id for the '<em>Rectangle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @see sensingflow.model.impl.SensingflowPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 14;


	/**
	 * Returns the meta object for class '{@link sensingflow.model.SensingflowContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see sensingflow.model.SensingflowContainer
	 * @generated
	 */
	EClass getSensingflowContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link sensingflow.model.SensingflowContainer#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see sensingflow.model.SensingflowContainer#getNodes()
	 * @see #getSensingflowContainer()
	 * @generated
	 */
	EReference getSensingflowContainer_Nodes();

	/**
	 * Returns the meta object for the attribute '{@link sensingflow.model.SensingflowContainer#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see sensingflow.model.SensingflowContainer#getId()
	 * @see #getSensingflowContainer()
	 * @generated
	 */
	EAttribute getSensingflowContainer_Id();

	/**
	 * Returns the meta object for class '{@link sensingflow.model.SensingflowProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see sensingflow.model.SensingflowProcessor
	 * @generated
	 */
	EClass getSensingflowProcessor();

	/**
	 * Returns the meta object for the containment reference list '{@link sensingflow.model.SensingflowProcessor#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see sensingflow.model.SensingflowProcessor#getLinks()
	 * @see #getSensingflowProcessor()
	 * @generated
	 */
	EReference getSensingflowProcessor_Links();

	/**
	 * Returns the meta object for the attribute '{@link sensingflow.model.SensingflowProcessor#getContextType <em>Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Type</em>'.
	 * @see sensingflow.model.SensingflowProcessor#getContextType()
	 * @see #getSensingflowProcessor()
	 * @generated
	 */
	EAttribute getSensingflowProcessor_ContextType();

	/**
	 * Returns the meta object for the attribute '{@link sensingflow.model.SensingflowProcessor#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error</em>'.
	 * @see sensingflow.model.SensingflowProcessor#getError()
	 * @see #getSensingflowProcessor()
	 * @generated
	 */
	EAttribute getSensingflowProcessor_Error();

	/**
	 * Returns the meta object for the attribute '{@link sensingflow.model.SensingflowProcessor#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values</em>'.
	 * @see sensingflow.model.SensingflowProcessor#getValues()
	 * @see #getSensingflowProcessor()
	 * @generated
	 */
	EAttribute getSensingflowProcessor_Values();

	/**
	 * Returns the meta object for class '{@link sensingflow.model.SensingflowNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see sensingflow.model.SensingflowNode
	 * @generated
	 */
	EClass getSensingflowNode();

	/**
	 * Returns the meta object for the reference list '{@link sensingflow.model.SensingflowNode#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Links</em>'.
	 * @see sensingflow.model.SensingflowNode#getIncomingLinks()
	 * @see #getSensingflowNode()
	 * @generated
	 */
	EReference getSensingflowNode_IncomingLinks();

	/**
	 * Returns the meta object for the reference list '{@link sensingflow.model.SensingflowNode#getOutgoingLinks <em>Outgoing Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Links</em>'.
	 * @see sensingflow.model.SensingflowNode#getOutgoingLinks()
	 * @see #getSensingflowNode()
	 * @generated
	 */
	EReference getSensingflowNode_OutgoingLinks();

	/**
	 * Returns the meta object for the container reference '{@link sensingflow.model.SensingflowNode#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see sensingflow.model.SensingflowNode#getContainer()
	 * @see #getSensingflowNode()
	 * @generated
	 */
	EReference getSensingflowNode_Container();

	/**
	 * Returns the meta object for the attribute '{@link sensingflow.model.SensingflowNode#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraints</em>'.
	 * @see sensingflow.model.SensingflowNode#getConstraints()
	 * @see #getSensingflowNode()
	 * @generated
	 */
	EAttribute getSensingflowNode_Constraints();

	/**
	 * Returns the meta object for the '{@link sensingflow.model.SensingflowNode#getProc() <em>Get Proc</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Proc</em>' operation.
	 * @see sensingflow.model.SensingflowNode#getProc()
	 * @generated
	 */
	EOperation getSensingflowNode__GetProc();

	/**
	 * Returns the meta object for class '{@link sensingflow.model.SensingflowThing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing</em>'.
	 * @see sensingflow.model.SensingflowThing
	 * @generated
	 */
	EClass getSensingflowThing();

	/**
	 * Returns the meta object for the attribute '{@link sensingflow.model.SensingflowThing#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sensingflow.model.SensingflowThing#getName()
	 * @see #getSensingflowThing()
	 * @generated
	 */
	EAttribute getSensingflowThing_Name();

	/**
	 * Returns the meta object for the attribute '{@link sensingflow.model.SensingflowThing#getLogicParameter <em>Logic Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logic Parameter</em>'.
	 * @see sensingflow.model.SensingflowThing#getLogicParameter()
	 * @see #getSensingflowThing()
	 * @generated
	 */
	EAttribute getSensingflowThing_LogicParameter();

	/**
	 * Returns the meta object for the attribute '{@link sensingflow.model.SensingflowThing#getDeviceId <em>Device Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Id</em>'.
	 * @see sensingflow.model.SensingflowThing#getDeviceId()
	 * @see #getSensingflowThing()
	 * @generated
	 */
	EAttribute getSensingflowThing_DeviceId();

	/**
	 * Returns the meta object for the attribute '{@link sensingflow.model.SensingflowThing#getInstantParameter <em>Instant Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instant Parameter</em>'.
	 * @see sensingflow.model.SensingflowThing#getInstantParameter()
	 * @see #getSensingflowThing()
	 * @generated
	 */
	EAttribute getSensingflowThing_InstantParameter();

	/**
	 * Returns the meta object for the reference list '{@link sensingflow.model.SensingflowThing#getOutPorts <em>Out Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Ports</em>'.
	 * @see sensingflow.model.SensingflowThing#getOutPorts()
	 * @see #getSensingflowThing()
	 * @generated
	 */
	EReference getSensingflowThing_OutPorts();

	/**
	 * Returns the meta object for class '{@link sensingflow.model.SensingflowSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see sensingflow.model.SensingflowSensor
	 * @generated
	 */
	EClass getSensingflowSensor();

	/**
	 * Returns the meta object for the attribute '{@link sensingflow.model.SensingflowSensor#getOperatorName <em>Operator Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator Name</em>'.
	 * @see sensingflow.model.SensingflowSensor#getOperatorName()
	 * @see #getSensingflowSensor()
	 * @generated
	 */
	EAttribute getSensingflowSensor_OperatorName();

	/**
	 * Returns the meta object for class '{@link sensingflow.model.SensingflowTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see sensingflow.model.SensingflowTask
	 * @generated
	 */
	EClass getSensingflowTask();

	/**
	 * Returns the meta object for the reference list '{@link sensingflow.model.SensingflowTask#getInPorts <em>In Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Ports</em>'.
	 * @see sensingflow.model.SensingflowTask#getInPorts()
	 * @see #getSensingflowTask()
	 * @generated
	 */
	EReference getSensingflowTask_InPorts();

	/**
	 * Returns the meta object for the attribute '{@link sensingflow.model.SensingflowTask#getOperatorName <em>Operator Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator Name</em>'.
	 * @see sensingflow.model.SensingflowTask#getOperatorName()
	 * @see #getSensingflowTask()
	 * @generated
	 */
	EAttribute getSensingflowTask_OperatorName();

	/**
	 * Returns the meta object for class '{@link sensingflow.model.SensingflowLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see sensingflow.model.SensingflowLink
	 * @generated
	 */
	EClass getSensingflowLink();

	/**
	 * Returns the meta object for the container reference '{@link sensingflow.model.SensingflowLink#getProc <em>Proc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Proc</em>'.
	 * @see sensingflow.model.SensingflowLink#getProc()
	 * @see #getSensingflowLink()
	 * @generated
	 */
	EReference getSensingflowLink_Proc();

	/**
	 * Returns the meta object for the reference '{@link sensingflow.model.SensingflowLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see sensingflow.model.SensingflowLink#getSource()
	 * @see #getSensingflowLink()
	 * @generated
	 */
	EReference getSensingflowLink_Source();

	/**
	 * Returns the meta object for the reference '{@link sensingflow.model.SensingflowLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see sensingflow.model.SensingflowLink#getTarget()
	 * @see #getSensingflowLink()
	 * @generated
	 */
	EReference getSensingflowLink_Target();

	/**
	 * Returns the meta object for the attribute list '{@link sensingflow.model.SensingflowLink#getBendpoints <em>Bendpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bendpoints</em>'.
	 * @see sensingflow.model.SensingflowLink#getBendpoints()
	 * @see #getSensingflowLink()
	 * @generated
	 */
	EAttribute getSensingflowLink_Bendpoints();

	/**
	 * Returns the meta object for the attribute '{@link sensingflow.model.SensingflowLink#getRouterKind <em>Router Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Router Kind</em>'.
	 * @see sensingflow.model.SensingflowLink#getRouterKind()
	 * @see #getSensingflowLink()
	 * @generated
	 */
	EAttribute getSensingflowLink_RouterKind();

	/**
	 * Returns the meta object for the attribute '{@link sensingflow.model.SensingflowLink#getWindowSize <em>Window Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Window Size</em>'.
	 * @see sensingflow.model.SensingflowLink#getWindowSize()
	 * @see #getSensingflowLink()
	 * @generated
	 */
	EAttribute getSensingflowLink_WindowSize();

	/**
	 * Returns the meta object for the attribute '{@link sensingflow.model.SensingflowLink#getSlidingWindowSize <em>Sliding Window Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sliding Window Size</em>'.
	 * @see sensingflow.model.SensingflowLink#getSlidingWindowSize()
	 * @see #getSensingflowLink()
	 * @generated
	 */
	EAttribute getSensingflowLink_SlidingWindowSize();

	/**
	 * Returns the meta object for class '{@link sensingflow.model.SensingflowPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see sensingflow.model.SensingflowPort
	 * @generated
	 */
	EClass getSensingflowPort();

	/**
	 * Returns the meta object for class '{@link sensingflow.model.SensingflowInPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Port</em>'.
	 * @see sensingflow.model.SensingflowInPort
	 * @generated
	 */
	EClass getSensingflowInPort();

	/**
	 * Returns the meta object for the reference '{@link sensingflow.model.SensingflowInPort#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see sensingflow.model.SensingflowInPort#getTask()
	 * @see #getSensingflowInPort()
	 * @generated
	 */
	EReference getSensingflowInPort_Task();

	/**
	 * Returns the meta object for class '{@link sensingflow.model.SensingflowOutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Port</em>'.
	 * @see sensingflow.model.SensingflowOutPort
	 * @generated
	 */
	EClass getSensingflowOutPort();

	/**
	 * Returns the meta object for the attribute '{@link sensingflow.model.SensingflowOutPort#getOutputSize <em>Output Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Size</em>'.
	 * @see sensingflow.model.SensingflowOutPort#getOutputSize()
	 * @see #getSensingflowOutPort()
	 * @generated
	 */
	EAttribute getSensingflowOutPort_OutputSize();

	/**
	 * Returns the meta object for the reference '{@link sensingflow.model.SensingflowOutPort#getThing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thing</em>'.
	 * @see sensingflow.model.SensingflowOutPort#getThing()
	 * @see #getSensingflowOutPort()
	 * @generated
	 */
	EReference getSensingflowOutPort_Thing();

	/**
	 * Returns the meta object for the attribute '{@link sensingflow.model.SensingflowOutPort#getFrameSize <em>Frame Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame Size</em>'.
	 * @see sensingflow.model.SensingflowOutPort#getFrameSize()
	 * @see #getSensingflowOutPort()
	 * @generated
	 */
	EAttribute getSensingflowOutPort_FrameSize();

	/**
	 * Returns the meta object for the attribute '{@link sensingflow.model.SensingflowOutPort#getSubFrameSize <em>Sub Frame Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Frame Size</em>'.
	 * @see sensingflow.model.SensingflowOutPort#getSubFrameSize()
	 * @see #getSensingflowOutPort()
	 * @generated
	 */
	EAttribute getSensingflowOutPort_SubFrameSize();

	/**
	 * Returns the meta object for the attribute '{@link sensingflow.model.SensingflowOutPort#getSubFrameSlidingSize <em>Sub Frame Sliding Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Frame Sliding Size</em>'.
	 * @see sensingflow.model.SensingflowOutPort#getSubFrameSlidingSize()
	 * @see #getSensingflowOutPort()
	 * @generated
	 */
	EAttribute getSensingflowOutPort_SubFrameSlidingSize();

	/**
	 * Returns the meta object for the attribute '{@link sensingflow.model.SensingflowOutPort#getFrameInterval <em>Frame Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame Interval</em>'.
	 * @see sensingflow.model.SensingflowOutPort#getFrameInterval()
	 * @see #getSensingflowOutPort()
	 * @generated
	 */
	EAttribute getSensingflowOutPort_FrameInterval();

	/**
	 * Returns the meta object for enum '{@link sensingflow.model.SensingflowLinkRouterKind <em>Link Router Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Link Router Kind</em>'.
	 * @see sensingflow.model.SensingflowLinkRouterKind
	 * @generated
	 */
	EEnum getSensingflowLinkRouterKind();

	/**
	 * Returns the meta object for enum '{@link sensingflow.model.SensingflowSensorType <em>Sensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sensor Type</em>'.
	 * @see sensingflow.model.SensingflowSensorType
	 * @generated
	 */
	EEnum getSensingflowSensorType();

	/**
	 * Returns the meta object for enum '{@link sensingflow.model.SensingflowTaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Task Type</em>'.
	 * @see sensingflow.model.SensingflowTaskType
	 * @generated
	 */
	EEnum getSensingflowTaskType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point</em>'.
	 * @see org.eclipse.draw2d.geometry.Point
	 * @model instanceClass="org.eclipse.draw2d.geometry.Point"
	 * @generated
	 */
	EDataType getPoint();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rectangle</em>'.
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @model instanceClass="org.eclipse.draw2d.geometry.Rectangle"
	 * @generated
	 */
	EDataType getRectangle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SensingflowFactory getSensingflowFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sensingflow.model.impl.SensingflowContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensingflow.model.impl.SensingflowContainerImpl
		 * @see sensingflow.model.impl.SensingflowPackageImpl#getSensingflowContainer()
		 * @generated
		 */
		EClass SENSINGFLOW_CONTAINER = eINSTANCE.getSensingflowContainer();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSINGFLOW_CONTAINER__NODES = eINSTANCE.getSensingflowContainer_Nodes();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSINGFLOW_CONTAINER__ID = eINSTANCE.getSensingflowContainer_Id();

		/**
		 * The meta object literal for the '{@link sensingflow.model.impl.SensingflowProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensingflow.model.impl.SensingflowProcessorImpl
		 * @see sensingflow.model.impl.SensingflowPackageImpl#getSensingflowProcessor()
		 * @generated
		 */
		EClass SENSINGFLOW_PROCESSOR = eINSTANCE.getSensingflowProcessor();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSINGFLOW_PROCESSOR__LINKS = eINSTANCE.getSensingflowProcessor_Links();

		/**
		 * The meta object literal for the '<em><b>Context Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSINGFLOW_PROCESSOR__CONTEXT_TYPE = eINSTANCE.getSensingflowProcessor_ContextType();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSINGFLOW_PROCESSOR__ERROR = eINSTANCE.getSensingflowProcessor_Error();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSINGFLOW_PROCESSOR__VALUES = eINSTANCE.getSensingflowProcessor_Values();

		/**
		 * The meta object literal for the '{@link sensingflow.model.impl.SensingflowNodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensingflow.model.impl.SensingflowNodeImpl
		 * @see sensingflow.model.impl.SensingflowPackageImpl#getSensingflowNode()
		 * @generated
		 */
		EClass SENSINGFLOW_NODE = eINSTANCE.getSensingflowNode();

		/**
		 * The meta object literal for the '<em><b>Incoming Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSINGFLOW_NODE__INCOMING_LINKS = eINSTANCE.getSensingflowNode_IncomingLinks();

		/**
		 * The meta object literal for the '<em><b>Outgoing Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSINGFLOW_NODE__OUTGOING_LINKS = eINSTANCE.getSensingflowNode_OutgoingLinks();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSINGFLOW_NODE__CONTAINER = eINSTANCE.getSensingflowNode_Container();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSINGFLOW_NODE__CONSTRAINTS = eINSTANCE.getSensingflowNode_Constraints();

		/**
		 * The meta object literal for the '<em><b>Get Proc</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENSINGFLOW_NODE___GET_PROC = eINSTANCE.getSensingflowNode__GetProc();

		/**
		 * The meta object literal for the '{@link sensingflow.model.impl.SensingflowThingImpl <em>Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensingflow.model.impl.SensingflowThingImpl
		 * @see sensingflow.model.impl.SensingflowPackageImpl#getSensingflowThing()
		 * @generated
		 */
		EClass SENSINGFLOW_THING = eINSTANCE.getSensingflowThing();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSINGFLOW_THING__NAME = eINSTANCE.getSensingflowThing_Name();

		/**
		 * The meta object literal for the '<em><b>Logic Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSINGFLOW_THING__LOGIC_PARAMETER = eINSTANCE.getSensingflowThing_LogicParameter();

		/**
		 * The meta object literal for the '<em><b>Device Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSINGFLOW_THING__DEVICE_ID = eINSTANCE.getSensingflowThing_DeviceId();

		/**
		 * The meta object literal for the '<em><b>Instant Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSINGFLOW_THING__INSTANT_PARAMETER = eINSTANCE.getSensingflowThing_InstantParameter();

		/**
		 * The meta object literal for the '<em><b>Out Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSINGFLOW_THING__OUT_PORTS = eINSTANCE.getSensingflowThing_OutPorts();

		/**
		 * The meta object literal for the '{@link sensingflow.model.impl.SensingflowSensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensingflow.model.impl.SensingflowSensorImpl
		 * @see sensingflow.model.impl.SensingflowPackageImpl#getSensingflowSensor()
		 * @generated
		 */
		EClass SENSINGFLOW_SENSOR = eINSTANCE.getSensingflowSensor();

		/**
		 * The meta object literal for the '<em><b>Operator Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSINGFLOW_SENSOR__OPERATOR_NAME = eINSTANCE.getSensingflowSensor_OperatorName();

		/**
		 * The meta object literal for the '{@link sensingflow.model.impl.SensingflowTaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensingflow.model.impl.SensingflowTaskImpl
		 * @see sensingflow.model.impl.SensingflowPackageImpl#getSensingflowTask()
		 * @generated
		 */
		EClass SENSINGFLOW_TASK = eINSTANCE.getSensingflowTask();

		/**
		 * The meta object literal for the '<em><b>In Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSINGFLOW_TASK__IN_PORTS = eINSTANCE.getSensingflowTask_InPorts();

		/**
		 * The meta object literal for the '<em><b>Operator Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSINGFLOW_TASK__OPERATOR_NAME = eINSTANCE.getSensingflowTask_OperatorName();

		/**
		 * The meta object literal for the '{@link sensingflow.model.impl.SensingflowLinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensingflow.model.impl.SensingflowLinkImpl
		 * @see sensingflow.model.impl.SensingflowPackageImpl#getSensingflowLink()
		 * @generated
		 */
		EClass SENSINGFLOW_LINK = eINSTANCE.getSensingflowLink();

		/**
		 * The meta object literal for the '<em><b>Proc</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSINGFLOW_LINK__PROC = eINSTANCE.getSensingflowLink_Proc();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSINGFLOW_LINK__SOURCE = eINSTANCE.getSensingflowLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSINGFLOW_LINK__TARGET = eINSTANCE.getSensingflowLink_Target();

		/**
		 * The meta object literal for the '<em><b>Bendpoints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSINGFLOW_LINK__BENDPOINTS = eINSTANCE.getSensingflowLink_Bendpoints();

		/**
		 * The meta object literal for the '<em><b>Router Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSINGFLOW_LINK__ROUTER_KIND = eINSTANCE.getSensingflowLink_RouterKind();

		/**
		 * The meta object literal for the '<em><b>Window Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSINGFLOW_LINK__WINDOW_SIZE = eINSTANCE.getSensingflowLink_WindowSize();

		/**
		 * The meta object literal for the '<em><b>Sliding Window Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSINGFLOW_LINK__SLIDING_WINDOW_SIZE = eINSTANCE.getSensingflowLink_SlidingWindowSize();

		/**
		 * The meta object literal for the '{@link sensingflow.model.impl.SensingflowPortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensingflow.model.impl.SensingflowPortImpl
		 * @see sensingflow.model.impl.SensingflowPackageImpl#getSensingflowPort()
		 * @generated
		 */
		EClass SENSINGFLOW_PORT = eINSTANCE.getSensingflowPort();

		/**
		 * The meta object literal for the '{@link sensingflow.model.impl.SensingflowInPortImpl <em>In Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensingflow.model.impl.SensingflowInPortImpl
		 * @see sensingflow.model.impl.SensingflowPackageImpl#getSensingflowInPort()
		 * @generated
		 */
		EClass SENSINGFLOW_IN_PORT = eINSTANCE.getSensingflowInPort();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSINGFLOW_IN_PORT__TASK = eINSTANCE.getSensingflowInPort_Task();

		/**
		 * The meta object literal for the '{@link sensingflow.model.impl.SensingflowOutPortImpl <em>Out Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensingflow.model.impl.SensingflowOutPortImpl
		 * @see sensingflow.model.impl.SensingflowPackageImpl#getSensingflowOutPort()
		 * @generated
		 */
		EClass SENSINGFLOW_OUT_PORT = eINSTANCE.getSensingflowOutPort();

		/**
		 * The meta object literal for the '<em><b>Output Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSINGFLOW_OUT_PORT__OUTPUT_SIZE = eINSTANCE.getSensingflowOutPort_OutputSize();

		/**
		 * The meta object literal for the '<em><b>Thing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSINGFLOW_OUT_PORT__THING = eINSTANCE.getSensingflowOutPort_Thing();

		/**
		 * The meta object literal for the '<em><b>Frame Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSINGFLOW_OUT_PORT__FRAME_SIZE = eINSTANCE.getSensingflowOutPort_FrameSize();

		/**
		 * The meta object literal for the '<em><b>Sub Frame Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSINGFLOW_OUT_PORT__SUB_FRAME_SIZE = eINSTANCE.getSensingflowOutPort_SubFrameSize();

		/**
		 * The meta object literal for the '<em><b>Sub Frame Sliding Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSINGFLOW_OUT_PORT__SUB_FRAME_SLIDING_SIZE = eINSTANCE.getSensingflowOutPort_SubFrameSlidingSize();

		/**
		 * The meta object literal for the '<em><b>Frame Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSINGFLOW_OUT_PORT__FRAME_INTERVAL = eINSTANCE.getSensingflowOutPort_FrameInterval();

		/**
		 * The meta object literal for the '{@link sensingflow.model.SensingflowLinkRouterKind <em>Link Router Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensingflow.model.SensingflowLinkRouterKind
		 * @see sensingflow.model.impl.SensingflowPackageImpl#getSensingflowLinkRouterKind()
		 * @generated
		 */
		EEnum SENSINGFLOW_LINK_ROUTER_KIND = eINSTANCE.getSensingflowLinkRouterKind();

		/**
		 * The meta object literal for the '{@link sensingflow.model.SensingflowSensorType <em>Sensor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensingflow.model.SensingflowSensorType
		 * @see sensingflow.model.impl.SensingflowPackageImpl#getSensingflowSensorType()
		 * @generated
		 */
		EEnum SENSINGFLOW_SENSOR_TYPE = eINSTANCE.getSensingflowSensorType();

		/**
		 * The meta object literal for the '{@link sensingflow.model.SensingflowTaskType <em>Task Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensingflow.model.SensingflowTaskType
		 * @see sensingflow.model.impl.SensingflowPackageImpl#getSensingflowTaskType()
		 * @generated
		 */
		EEnum SENSINGFLOW_TASK_TYPE = eINSTANCE.getSensingflowTaskType();

		/**
		 * The meta object literal for the '<em>Point</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Point
		 * @see sensingflow.model.impl.SensingflowPackageImpl#getPoint()
		 * @generated
		 */
		EDataType POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em>Rectangle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Rectangle
		 * @see sensingflow.model.impl.SensingflowPackageImpl#getRectangle()
		 * @generated
		 */
		EDataType RECTANGLE = eINSTANCE.getRectangle();

	}

} //SensingflowPackage
