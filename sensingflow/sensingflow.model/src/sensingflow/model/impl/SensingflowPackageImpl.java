/**
 */
package sensingflow.model.impl;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import sensingflow.model.SensingflowContainer;
import sensingflow.model.SensingflowFactory;
import sensingflow.model.SensingflowInPort;
import sensingflow.model.SensingflowLink;
import sensingflow.model.SensingflowLinkRouterKind;
import sensingflow.model.SensingflowNode;
import sensingflow.model.SensingflowOutPort;
import sensingflow.model.SensingflowPackage;
import sensingflow.model.SensingflowPort;
import sensingflow.model.SensingflowProcessor;
import sensingflow.model.SensingflowSensor;
import sensingflow.model.SensingflowSensorType;
import sensingflow.model.SensingflowTask;
import sensingflow.model.SensingflowTaskType;
import sensingflow.model.SensingflowThing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensingflowPackageImpl extends EPackageImpl implements SensingflowPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensingflowContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensingflowProcessorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensingflowNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensingflowThingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensingflowSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensingflowTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensingflowLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensingflowPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensingflowInPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensingflowOutPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sensingflowLinkRouterKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sensingflowSensorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sensingflowTaskTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pointEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rectangleEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see sensingflow.model.SensingflowPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SensingflowPackageImpl() {
		super(eNS_URI, SensingflowFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SensingflowPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SensingflowPackage init() {
		if (isInited) return (SensingflowPackage)EPackage.Registry.INSTANCE.getEPackage(SensingflowPackage.eNS_URI);

		// Obtain or create and register package
		SensingflowPackageImpl theSensingflowPackage = (SensingflowPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SensingflowPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SensingflowPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSensingflowPackage.createPackageContents();

		// Initialize created meta-data
		theSensingflowPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSensingflowPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SensingflowPackage.eNS_URI, theSensingflowPackage);
		return theSensingflowPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensingflowContainer() {
		return sensingflowContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensingflowContainer_Nodes() {
		return (EReference)sensingflowContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensingflowContainer_Id() {
		return (EAttribute)sensingflowContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensingflowProcessor() {
		return sensingflowProcessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensingflowProcessor_Links() {
		return (EReference)sensingflowProcessorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensingflowProcessor_ContextType() {
		return (EAttribute)sensingflowProcessorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensingflowProcessor_Error() {
		return (EAttribute)sensingflowProcessorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensingflowProcessor_Values() {
		return (EAttribute)sensingflowProcessorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensingflowNode() {
		return sensingflowNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensingflowNode_IncomingLinks() {
		return (EReference)sensingflowNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensingflowNode_OutgoingLinks() {
		return (EReference)sensingflowNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensingflowNode_Container() {
		return (EReference)sensingflowNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensingflowNode_Constraints() {
		return (EAttribute)sensingflowNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensingflowNode__GetProc() {
		return sensingflowNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensingflowThing() {
		return sensingflowThingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensingflowThing_Name() {
		return (EAttribute)sensingflowThingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensingflowThing_LogicParameter() {
		return (EAttribute)sensingflowThingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensingflowThing_DeviceId() {
		return (EAttribute)sensingflowThingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensingflowThing_InstantParameter() {
		return (EAttribute)sensingflowThingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensingflowThing_OutPorts() {
		return (EReference)sensingflowThingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensingflowSensor() {
		return sensingflowSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensingflowSensor_OperatorName() {
		return (EAttribute)sensingflowSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensingflowTask() {
		return sensingflowTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensingflowTask_InPorts() {
		return (EReference)sensingflowTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensingflowTask_OperatorName() {
		return (EAttribute)sensingflowTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensingflowLink() {
		return sensingflowLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensingflowLink_Proc() {
		return (EReference)sensingflowLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensingflowLink_Source() {
		return (EReference)sensingflowLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensingflowLink_Target() {
		return (EReference)sensingflowLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensingflowLink_Bendpoints() {
		return (EAttribute)sensingflowLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensingflowLink_RouterKind() {
		return (EAttribute)sensingflowLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensingflowLink_WindowSize() {
		return (EAttribute)sensingflowLinkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensingflowLink_SlidingWindowSize() {
		return (EAttribute)sensingflowLinkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensingflowPort() {
		return sensingflowPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensingflowInPort() {
		return sensingflowInPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensingflowInPort_Task() {
		return (EReference)sensingflowInPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensingflowOutPort() {
		return sensingflowOutPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensingflowOutPort_OutputSize() {
		return (EAttribute)sensingflowOutPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensingflowOutPort_Thing() {
		return (EReference)sensingflowOutPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensingflowOutPort_FrameSize() {
		return (EAttribute)sensingflowOutPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensingflowOutPort_SubFrameSize() {
		return (EAttribute)sensingflowOutPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensingflowOutPort_SubFrameSlidingSize() {
		return (EAttribute)sensingflowOutPortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensingflowOutPort_FrameInterval() {
		return (EAttribute)sensingflowOutPortEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSensingflowLinkRouterKind() {
		return sensingflowLinkRouterKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSensingflowSensorType() {
		return sensingflowSensorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSensingflowTaskType() {
		return sensingflowTaskTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPoint() {
		return pointEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRectangle() {
		return rectangleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowFactory getSensingflowFactory() {
		return (SensingflowFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sensingflowContainerEClass = createEClass(SENSINGFLOW_CONTAINER);
		createEReference(sensingflowContainerEClass, SENSINGFLOW_CONTAINER__NODES);
		createEAttribute(sensingflowContainerEClass, SENSINGFLOW_CONTAINER__ID);

		sensingflowProcessorEClass = createEClass(SENSINGFLOW_PROCESSOR);
		createEReference(sensingflowProcessorEClass, SENSINGFLOW_PROCESSOR__LINKS);
		createEAttribute(sensingflowProcessorEClass, SENSINGFLOW_PROCESSOR__CONTEXT_TYPE);
		createEAttribute(sensingflowProcessorEClass, SENSINGFLOW_PROCESSOR__ERROR);
		createEAttribute(sensingflowProcessorEClass, SENSINGFLOW_PROCESSOR__VALUES);

		sensingflowNodeEClass = createEClass(SENSINGFLOW_NODE);
		createEReference(sensingflowNodeEClass, SENSINGFLOW_NODE__INCOMING_LINKS);
		createEReference(sensingflowNodeEClass, SENSINGFLOW_NODE__OUTGOING_LINKS);
		createEReference(sensingflowNodeEClass, SENSINGFLOW_NODE__CONTAINER);
		createEAttribute(sensingflowNodeEClass, SENSINGFLOW_NODE__CONSTRAINTS);
		createEOperation(sensingflowNodeEClass, SENSINGFLOW_NODE___GET_PROC);

		sensingflowThingEClass = createEClass(SENSINGFLOW_THING);
		createEAttribute(sensingflowThingEClass, SENSINGFLOW_THING__NAME);
		createEAttribute(sensingflowThingEClass, SENSINGFLOW_THING__LOGIC_PARAMETER);
		createEAttribute(sensingflowThingEClass, SENSINGFLOW_THING__DEVICE_ID);
		createEAttribute(sensingflowThingEClass, SENSINGFLOW_THING__INSTANT_PARAMETER);
		createEReference(sensingflowThingEClass, SENSINGFLOW_THING__OUT_PORTS);

		sensingflowSensorEClass = createEClass(SENSINGFLOW_SENSOR);
		createEAttribute(sensingflowSensorEClass, SENSINGFLOW_SENSOR__OPERATOR_NAME);

		sensingflowTaskEClass = createEClass(SENSINGFLOW_TASK);
		createEReference(sensingflowTaskEClass, SENSINGFLOW_TASK__IN_PORTS);
		createEAttribute(sensingflowTaskEClass, SENSINGFLOW_TASK__OPERATOR_NAME);

		sensingflowLinkEClass = createEClass(SENSINGFLOW_LINK);
		createEReference(sensingflowLinkEClass, SENSINGFLOW_LINK__PROC);
		createEReference(sensingflowLinkEClass, SENSINGFLOW_LINK__SOURCE);
		createEReference(sensingflowLinkEClass, SENSINGFLOW_LINK__TARGET);
		createEAttribute(sensingflowLinkEClass, SENSINGFLOW_LINK__BENDPOINTS);
		createEAttribute(sensingflowLinkEClass, SENSINGFLOW_LINK__ROUTER_KIND);
		createEAttribute(sensingflowLinkEClass, SENSINGFLOW_LINK__WINDOW_SIZE);
		createEAttribute(sensingflowLinkEClass, SENSINGFLOW_LINK__SLIDING_WINDOW_SIZE);

		sensingflowPortEClass = createEClass(SENSINGFLOW_PORT);

		sensingflowInPortEClass = createEClass(SENSINGFLOW_IN_PORT);
		createEReference(sensingflowInPortEClass, SENSINGFLOW_IN_PORT__TASK);

		sensingflowOutPortEClass = createEClass(SENSINGFLOW_OUT_PORT);
		createEAttribute(sensingflowOutPortEClass, SENSINGFLOW_OUT_PORT__OUTPUT_SIZE);
		createEReference(sensingflowOutPortEClass, SENSINGFLOW_OUT_PORT__THING);
		createEAttribute(sensingflowOutPortEClass, SENSINGFLOW_OUT_PORT__FRAME_SIZE);
		createEAttribute(sensingflowOutPortEClass, SENSINGFLOW_OUT_PORT__SUB_FRAME_SIZE);
		createEAttribute(sensingflowOutPortEClass, SENSINGFLOW_OUT_PORT__SUB_FRAME_SLIDING_SIZE);
		createEAttribute(sensingflowOutPortEClass, SENSINGFLOW_OUT_PORT__FRAME_INTERVAL);

		// Create enums
		sensingflowLinkRouterKindEEnum = createEEnum(SENSINGFLOW_LINK_ROUTER_KIND);
		sensingflowSensorTypeEEnum = createEEnum(SENSINGFLOW_SENSOR_TYPE);
		sensingflowTaskTypeEEnum = createEEnum(SENSINGFLOW_TASK_TYPE);

		// Create data types
		pointEDataType = createEDataType(POINT);
		rectangleEDataType = createEDataType(RECTANGLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sensingflowProcessorEClass.getESuperTypes().add(this.getSensingflowContainer());
		sensingflowNodeEClass.getESuperTypes().add(this.getSensingflowContainer());
		sensingflowThingEClass.getESuperTypes().add(this.getSensingflowNode());
		sensingflowSensorEClass.getESuperTypes().add(this.getSensingflowThing());
		sensingflowTaskEClass.getESuperTypes().add(this.getSensingflowThing());
		sensingflowPortEClass.getESuperTypes().add(this.getSensingflowNode());
		sensingflowInPortEClass.getESuperTypes().add(this.getSensingflowPort());
		sensingflowOutPortEClass.getESuperTypes().add(this.getSensingflowPort());

		// Initialize classes, features, and operations; add parameters
		initEClass(sensingflowContainerEClass, SensingflowContainer.class, "SensingflowContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSensingflowContainer_Nodes(), this.getSensingflowNode(), this.getSensingflowNode_Container(), "nodes", null, 0, -1, SensingflowContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensingflowContainer_Id(), ecorePackage.getEInt(), "id", null, 1, 1, SensingflowContainer.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sensingflowProcessorEClass, SensingflowProcessor.class, "SensingflowProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSensingflowProcessor_Links(), this.getSensingflowLink(), this.getSensingflowLink_Proc(), "links", null, 0, -1, SensingflowProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensingflowProcessor_ContextType(), ecorePackage.getEString(), "contextType", null, 1, 1, SensingflowProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSensingflowProcessor_Error(), ecorePackage.getEFloat(), "error", "0.1", 1, 1, SensingflowProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSensingflowProcessor_Values(), ecorePackage.getEString(), "values", null, 1, 1, SensingflowProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sensingflowNodeEClass, SensingflowNode.class, "SensingflowNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSensingflowNode_IncomingLinks(), this.getSensingflowLink(), this.getSensingflowLink_Target(), "incomingLinks", null, 0, -1, SensingflowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensingflowNode_OutgoingLinks(), this.getSensingflowLink(), this.getSensingflowLink_Source(), "outgoingLinks", null, 0, -1, SensingflowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensingflowNode_Container(), this.getSensingflowContainer(), this.getSensingflowContainer_Nodes(), "container", null, 0, 1, SensingflowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensingflowNode_Constraints(), this.getRectangle(), "constraints", "0,0,50,50", 0, 1, SensingflowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSensingflowNode__GetProc(), this.getSensingflowProcessor(), "getProc", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sensingflowThingEClass, SensingflowThing.class, "SensingflowThing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensingflowThing_Name(), ecorePackage.getEString(), "name", "<...>", 0, 1, SensingflowThing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensingflowThing_LogicParameter(), ecorePackage.getEString(), "logicParameter", "<...>", 0, 1, SensingflowThing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSensingflowThing_DeviceId(), ecorePackage.getEString(), "DeviceId", "<...>", 0, 1, SensingflowThing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSensingflowThing_InstantParameter(), ecorePackage.getEString(), "InstantParameter", "<...>", 0, 1, SensingflowThing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSensingflowThing_OutPorts(), this.getSensingflowOutPort(), this.getSensingflowOutPort_Thing(), "outPorts", null, 0, -1, SensingflowThing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensingflowSensorEClass, SensingflowSensor.class, "SensingflowSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensingflowSensor_OperatorName(), this.getSensingflowSensorType(), "operatorName", null, 0, 1, SensingflowSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensingflowTaskEClass, SensingflowTask.class, "SensingflowTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSensingflowTask_InPorts(), this.getSensingflowInPort(), this.getSensingflowInPort_Task(), "inPorts", null, 0, -1, SensingflowTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensingflowTask_OperatorName(), this.getSensingflowTaskType(), "operatorName", null, 0, 1, SensingflowTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensingflowLinkEClass, SensingflowLink.class, "SensingflowLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSensingflowLink_Proc(), this.getSensingflowProcessor(), this.getSensingflowProcessor_Links(), "proc", null, 0, 1, SensingflowLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensingflowLink_Source(), this.getSensingflowNode(), this.getSensingflowNode_OutgoingLinks(), "source", null, 0, 1, SensingflowLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensingflowLink_Target(), this.getSensingflowNode(), this.getSensingflowNode_IncomingLinks(), "target", null, 0, 1, SensingflowLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensingflowLink_Bendpoints(), this.getPoint(), "bendpoints", null, 0, -1, SensingflowLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensingflowLink_RouterKind(), this.getSensingflowLinkRouterKind(), "routerKind", null, 0, 1, SensingflowLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensingflowLink_WindowSize(), ecorePackage.getEInt(), "windowSize", null, 1, 1, SensingflowLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSensingflowLink_SlidingWindowSize(), ecorePackage.getEInt(), "slidingWindowSize", null, 1, 1, SensingflowLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sensingflowPortEClass, SensingflowPort.class, "SensingflowPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sensingflowInPortEClass, SensingflowInPort.class, "SensingflowInPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSensingflowInPort_Task(), this.getSensingflowTask(), this.getSensingflowTask_InPorts(), "task", null, 0, 1, SensingflowInPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensingflowOutPortEClass, SensingflowOutPort.class, "SensingflowOutPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensingflowOutPort_OutputSize(), ecorePackage.getEInt(), "outputSize", null, 1, 1, SensingflowOutPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSensingflowOutPort_Thing(), this.getSensingflowThing(), this.getSensingflowThing_OutPorts(), "thing", null, 0, 1, SensingflowOutPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensingflowOutPort_FrameSize(), ecorePackage.getEInt(), "frameSize", null, 1, 1, SensingflowOutPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSensingflowOutPort_SubFrameSize(), ecorePackage.getEInt(), "subFrameSize", null, 0, 1, SensingflowOutPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSensingflowOutPort_SubFrameSlidingSize(), ecorePackage.getEInt(), "subFrameSlidingSize", null, 0, 1, SensingflowOutPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSensingflowOutPort_FrameInterval(), ecorePackage.getEInt(), "frameInterval", null, 0, 1, SensingflowOutPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(sensingflowLinkRouterKindEEnum, SensingflowLinkRouterKind.class, "SensingflowLinkRouterKind");
		addEEnumLiteral(sensingflowLinkRouterKindEEnum, SensingflowLinkRouterKind.BENDPOINT);
		addEEnumLiteral(sensingflowLinkRouterKindEEnum, SensingflowLinkRouterKind.MANHATTAN);

		initEEnum(sensingflowSensorTypeEEnum, SensingflowSensorType.class, "SensingflowSensorType");
		addEEnumLiteral(sensingflowSensorTypeEEnum, SensingflowSensorType.DEFAULT_SENSOR);
		addEEnumLiteral(sensingflowSensorTypeEEnum, SensingflowSensorType.SENSING_SOUND);
		addEEnumLiteral(sensingflowSensorTypeEEnum, SensingflowSensorType.SENSING_ACCEL_DEFAULT);

		initEEnum(sensingflowTaskTypeEEnum, SensingflowTaskType.class, "SensingflowTaskType");
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.DEFAULT_TASK);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.ACCEL_DEFAULT);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.ARG_MAX);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.AVERAGE);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.AVERAGE_VECTOR);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.BANDWIDTH);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.BAT_PHONE_PLACE_DETECTION);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.BUTTERWORTH_FILTER);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.BYPASS);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.CORRELATION);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.CROSS_CORRELATION);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.DC);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.DECIBEL);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.DECISION_TREE);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.DEMODULATION);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.DOWNSAMPLING);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.ENERGY);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.ENTROPY);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.FFT);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.FFTC);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.FFT_NORMALIZED_MAGNITUDE);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.FILTER);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.GMM);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.HMM);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.INCREMENT);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.LEFR);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.MFCC);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.MFCC_DEMULTIPLEXER);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.NORMALIZE);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.PER_COM_COMPLEX);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.PER_COM_SIMPLE);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.ROOT_MEAN_SQUARE);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.RELATIVE_SPECTRAL_ENTROPY);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.RAW_DELTA_INTEGRAL);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.RESAMPLING);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.ROW_PERCENTILE);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.ROW_SORT);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.SBUFFER_WIN);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.SPECTRAL_CENTROID);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.SPECTRAL_FLUX);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.SPECTRAL_ROLLOFF);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.SWIN);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.SEGMENTOR);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.SMOOTHING);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.SOUND_ADMISSION_CONTROL);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.SPECTRUM);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.SQUARE);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.SUM);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.TWIN);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.VARIANCE);
		addEEnumLiteral(sensingflowTaskTypeEEnum, SensingflowTaskType.WINDOW_FUNCTION);

		// Initialize data types
		initEDataType(pointEDataType, Point.class, "Point", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rectangleEDataType, Rectangle.class, "Rectangle", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SensingflowPackageImpl
