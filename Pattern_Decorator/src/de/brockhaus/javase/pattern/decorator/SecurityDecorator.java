package de.brockhaus.javase.pattern.decorator;

import java.util.logging.Logger;

/**
 * 
 * @author mbohnen@brockhaus-group.com Copyright by: Brockhaus Group,
 *         Häusserstraße 36, 69115 Heidelberg
 * 
 */
// TODO extend appropriate superclass (but think of chaining the decorators:
// first Log, second this one)
public class SecurityDecorator extends AbstractDecorator {
	private Logger log = Logger.getLogger(this.getClass().getName());

	public SecurityDecorator(BusinessObject b) {
		super(b);
	}

	// TODO overwrite business method
	public void doSomething() {
		log.info("SecurityDecorator's method");
		// TODO go up the chain and invoke appropriate method at superclass
		target.doSomething();
		log.info("End of SecurityDecorator's method");

	}

}
