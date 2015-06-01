/**
 */
package sensingflow.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sensor Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sensingflow.model.SensingflowPackage#getSensingflowSensorType()
 * @model
 * @generated
 */
public enum SensingflowSensorType implements Enumerator {
	/**
	 * The '<em><b>Default Sensor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_SENSOR_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT_SENSOR(0, "DefaultSensor", "DefaultSensor"), /**
	 * The '<em><b>Sensing Sound</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENSING_SOUND_VALUE
	 * @generated
	 * @ordered
	 */
	SENSING_SOUND(1, "SensingSound", "SensingSound"), /**
	 * The '<em><b>Accel Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEL_DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	ACCEL_DEFAULT(2, "AccelDefault", "AccelDefault");

	/**
	 * The '<em><b>Default Sensor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Default Sensor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_SENSOR
	 * @model name="DefaultSensor"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_SENSOR_VALUE = 0;

	/**
	 * The '<em><b>Sensing Sound</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sensing Sound</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SENSING_SOUND
	 * @model name="SensingSound"
	 * @generated
	 * @ordered
	 */
	public static final int SENSING_SOUND_VALUE = 1;

	/**
	 * The '<em><b>Accel Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Accel Default</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCEL_DEFAULT
	 * @model name="AccelDefault"
	 * @generated
	 * @ordered
	 */
	public static final int ACCEL_DEFAULT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Sensor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SensingflowSensorType[] VALUES_ARRAY =
		new SensingflowSensorType[] {
			DEFAULT_SENSOR,
			SENSING_SOUND,
			ACCEL_DEFAULT,
		};

	/**
	 * A public read-only list of all the '<em><b>Sensor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SensingflowSensorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sensor Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SensingflowSensorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SensingflowSensorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sensor Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SensingflowSensorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SensingflowSensorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sensor Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SensingflowSensorType get(int value) {
		switch (value) {
			case DEFAULT_SENSOR_VALUE: return DEFAULT_SENSOR;
			case SENSING_SOUND_VALUE: return SENSING_SOUND;
			case ACCEL_DEFAULT_VALUE: return ACCEL_DEFAULT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SensingflowSensorType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SensingflowSensorType
