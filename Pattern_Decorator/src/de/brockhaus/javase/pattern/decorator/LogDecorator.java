package de.brockhaus.javase.pattern.decorator;

import java.util.logging.Logger;

/**
 * 
 * @author mbohnen@brockhaus-group.com Copyright by: Brockhaus Group,
 *         Häusserstraße 36, 69115 Heidelberg
 * 
 */
// TODO extend appropriate superclass so you will walk one step higher on the
// ladder
public class LogDecorator extends AbstractDecorator {
	private Logger log = Logger.getLogger(this.getClass().getName());

	public LogDecorator(BusinessObject b) {
		super(b);
	}

	// TODO overwrite business method
	public void doSomething() {
		log.info("LogDecorator's method");
		// TODO go up the chain and invoke appropriate method at superclass
		target.doSomething();
		log.info("End of LogDecorator's method");

	}
}
