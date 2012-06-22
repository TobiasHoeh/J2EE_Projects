package de.brockhaus.javase.pattern.decorator;

/**
 * No Singleton, no configuration through xml, simply nothing, a tracer bullet
 * to check whether we are aiming to the right direction ...
 * 
 * @author mbohnen@brockhaus-group.com Copyright by: Brockhaus Group,
 *         Häusserstraße 36, 69115 Heidelberg
 * 
 */
public class BusinessObjectFactory {
	public static BusinessObject getBusinessObject(boolean useDecorators) {
		BusinessObject bo = new BusinessObjectImpl();
		BusinessObject ret = null;

		// a fairly easy switch to decide whether we want to use decorators
		if (useDecorators == true) {
			// if we want to ...
			// we "weave" the security decorator to the business object
			ret = new LogDecorator(new SecurityDecorator(bo));
		} else {
			// in other cases it's the POJO only
			ret = bo;
		}

		return ret;
	}
}
