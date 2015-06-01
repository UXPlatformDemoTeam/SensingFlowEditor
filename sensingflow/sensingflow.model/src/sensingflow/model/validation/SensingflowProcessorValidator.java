/**
 *
 * $Id$
 */
package sensingflow.model.validation;

import org.eclipse.emf.common.util.EList;

import sensingflow.model.SensingflowLink;

/**
 * A sample validator interface for {@link sensingflow.model.SensingflowProcessor}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SensingflowProcessorValidator {
	boolean validate();

	boolean validateLinks(EList<SensingflowLink> value);

	boolean validateId(int value);

	boolean validateContextType(String value);

	boolean validateError(float value);

	boolean validateValues(String value);
}
