/**
 */
package sensingflow.model.impl;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sensingflow.model.*;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class SensingflowFactoryImpl extends EFactoryImpl implements
		SensingflowFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static SensingflowFactory init() {
		try {
			SensingflowFactory theSensingflowFactory = (SensingflowFactory)EPackage.Registry.INSTANCE.getEFactory(SensingflowPackage.eNS_URI);
			if (theSensingflowFactory != null) {
				return theSensingflowFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SensingflowFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public SensingflowFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SensingflowPackage.SENSINGFLOW_CONTAINER: return createSensingflowContainer();
			case SensingflowPackage.SENSINGFLOW_PROCESSOR: return createSensingflowProcessor();
			case SensingflowPackage.SENSINGFLOW_NODE: return createSensingflowNode();
			case SensingflowPackage.SENSINGFLOW_THING: return createSensingflowThing();
			case SensingflowPackage.SENSINGFLOW_SENSOR: return createSensingflowSensor();
			case SensingflowPackage.SENSINGFLOW_TASK: return createSensingflowTask();
			case SensingflowPackage.SENSINGFLOW_LINK: return createSensingflowLink();
			case SensingflowPackage.SENSINGFLOW_PORT: return createSensingflowPort();
			case SensingflowPackage.SENSINGFLOW_IN_PORT: return createSensingflowInPort();
			case SensingflowPackage.SENSINGFLOW_OUT_PORT: return createSensingflowOutPort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SensingflowPackage.SENSINGFLOW_LINK_ROUTER_KIND:
				return createSensingflowLinkRouterKindFromString(eDataType, initialValue);
			case SensingflowPackage.SENSINGFLOW_SENSOR_TYPE:
				return createSensingflowSensorTypeFromString(eDataType, initialValue);
			case SensingflowPackage.SENSINGFLOW_TASK_TYPE:
				return createSensingflowTaskTypeFromString(eDataType, initialValue);
			case SensingflowPackage.POINT:
				return createPointFromString(eDataType, initialValue);
			case SensingflowPackage.RECTANGLE:
				return createRectangleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SensingflowPackage.SENSINGFLOW_LINK_ROUTER_KIND:
				return convertSensingflowLinkRouterKindToString(eDataType, instanceValue);
			case SensingflowPackage.SENSINGFLOW_SENSOR_TYPE:
				return convertSensingflowSensorTypeToString(eDataType, instanceValue);
			case SensingflowPackage.SENSINGFLOW_TASK_TYPE:
				return convertSensingflowTaskTypeToString(eDataType, instanceValue);
			case SensingflowPackage.POINT:
				return convertPointToString(eDataType, instanceValue);
			case SensingflowPackage.RECTANGLE:
				return convertRectangleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowContainer createSensingflowContainer() {
		SensingflowContainerImpl sensingflowContainer = new SensingflowContainerImpl();
		return sensingflowContainer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowProcessor createSensingflowProcessor() {
		SensingflowProcessorImpl sensingflowProcessor = new SensingflowProcessorImpl();
		return sensingflowProcessor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowNode createSensingflowNode() {
		SensingflowNodeImpl sensingflowNode = new SensingflowNodeImpl();
		return sensingflowNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowThing createSensingflowThing() {
		SensingflowThingImpl sensingflowThing = new SensingflowThingImpl();
		return sensingflowThing;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowSensor createSensingflowSensor() {
		SensingflowSensorImpl sensingflowSensor = new SensingflowSensorImpl();
		return sensingflowSensor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowTask createSensingflowTask() {
		SensingflowTaskImpl sensingflowTask = new SensingflowTaskImpl();
		return sensingflowTask;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowLink createSensingflowLink() {
		SensingflowLinkImpl sensingflowLink = new SensingflowLinkImpl();
		return sensingflowLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowPort createSensingflowPort() {
		SensingflowPortImpl sensingflowPort = new SensingflowPortImpl();
		return sensingflowPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowInPort createSensingflowInPort() {
		SensingflowInPortImpl sensingflowInPort = new SensingflowInPortImpl();
		return sensingflowInPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowOutPort createSensingflowOutPort() {
		SensingflowOutPortImpl sensingflowOutPort = new SensingflowOutPortImpl();
		return sensingflowOutPort;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowLinkRouterKind createSensingflowLinkRouterKindFromString(
			EDataType eDataType, String initialValue) {
		SensingflowLinkRouterKind result = SensingflowLinkRouterKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSensingflowLinkRouterKindToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowSensorType createSensingflowSensorTypeFromString(EDataType eDataType, String initialValue) {
		SensingflowSensorType result = SensingflowSensorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSensingflowSensorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowTaskType createSensingflowTaskTypeFromString(EDataType eDataType, String initialValue) {
		SensingflowTaskType result = SensingflowTaskType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSensingflowTaskTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Point createPointFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) {
			return null;
		}
		initialValue.replaceAll("\\s", "");
		String[] values = initialValue.split(",");
		if (values.length != 2) {
			return null;
		}

		Point point = new Point();
		try {
			point.setLocation(Integer.parseInt(values[0]),
					Integer.parseInt(values[1]));
		} catch (NumberFormatException e) {
			EcorePlugin.INSTANCE.log(e);
			point = null;
		}
		return point;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String convertPointToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) {
			return null;
		}
		Point p = (Point) instanceValue;
		return p.x + "," + p.y;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Rectangle createRectangleFromString(EDataType eDataType,
			String initialValue) {
		
		if (initialValue == null) {
			return null;
		}
		initialValue.replaceAll("\\s", "");
		String[] values = initialValue.split(",");
		if (values.length != 4) {
			return null;
		}

		Rectangle rect = new Rectangle();
		try {
			rect.setLocation(Integer.parseInt(values[0]),
					Integer.parseInt(values[1]));
			rect.setSize(Integer.parseInt(values[2]),
					Integer.parseInt(values[3]));
		} catch (NumberFormatException e) {
			EcorePlugin.INSTANCE.log(e);
			rect = null;
		}
		return rect;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String convertRectangleToString(EDataType eDataType,
			Object instanceValue) {
		if (instanceValue == null) {
			return null;
		}
		Rectangle rect = (Rectangle) instanceValue;
		return rect.x + "," + rect.y + "," + rect.width + "," + rect.height;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowPackage getSensingflowPackage() {
		return (SensingflowPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SensingflowPackage getPackage() {
		return SensingflowPackage.eINSTANCE;
	}

} // SensingflowFactoryImpl
