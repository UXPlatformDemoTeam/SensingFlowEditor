/**
 */
package sensingflow.model.test;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>sensingflow</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensingflowTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new SensingflowTests("sensingflow Tests");
		suite.addTestSuite(SensingflowNodeTest.class);
		suite.addTestSuite(SensingflowThingTest.class);
		suite.addTestSuite(SensingflowSensorTest.class);
		suite.addTestSuite(SensingflowTaskTest.class);
		suite.addTestSuite(SensingflowPortTest.class);
		suite.addTestSuite(SensingflowInPortTest.class);
		suite.addTestSuite(SensingflowOutPortTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowTests(String name) {
		super(name);
	}

} //SensingflowTests
