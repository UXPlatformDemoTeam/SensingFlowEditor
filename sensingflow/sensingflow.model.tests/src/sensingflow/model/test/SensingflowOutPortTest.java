/**
 */
package sensingflow.model.test;

import junit.textui.TestRunner;

import sensingflow.model.SensingflowFactory;
import sensingflow.model.SensingflowOutPort;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Out Port</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensingflowOutPortTest extends SensingflowPortTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SensingflowOutPortTest.class);
	}

	/**
	 * Constructs a new Out Port test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowOutPortTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Out Port test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SensingflowOutPort getFixture() {
		return (SensingflowOutPort)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SensingflowFactory.eINSTANCE.createSensingflowOutPort());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SensingflowOutPortTest
