/**
 */
package sensingflow.model.test;

import junit.textui.TestRunner;

import sensingflow.model.SensingflowFactory;
import sensingflow.model.SensingflowInPort;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>In Port</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensingflowInPortTest extends SensingflowPortTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SensingflowInPortTest.class);
	}

	/**
	 * Constructs a new In Port test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowInPortTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this In Port test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SensingflowInPort getFixture() {
		return (SensingflowInPort)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SensingflowFactory.eINSTANCE.createSensingflowInPort());
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

} //SensingflowInPortTest
