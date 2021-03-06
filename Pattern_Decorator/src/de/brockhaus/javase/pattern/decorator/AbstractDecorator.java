package de.brockhaus.javase.pattern.decorator;

import java.util.logging.Logger;

/**
 * Our super decorator, abstract so no instantiation only extending
 * 
 * Implements same interface as the class which will be decorated.
 * 
 * @author mbohnen@brockhaus-group.com Copyright by: Brockhaus Group,
 *         Häusserstraße 36, 69115 Heidelberg
 */
// TODO implement the interface
public abstract class AbstractDecorator implements BusinessObject {
	/** our target we want to invoke the method at */
	protected BusinessObject target;
	/** just a logger */
	private Logger log = Logger.getLogger(this.getClass().getName());

	public AbstractDecorator() {
		// lazy
	}

	// TODO implement constructor and provide an object which acts as a
	// target
	public AbstractDecorator(BusinessObject target) {
		log.info("Object created");

		// TODO set target provided for later invocations
		this.setTarget(target);
	}

	protected void setTarget(BusinessObject t) {
		log.info("setting target");
		this.target = t;
	}

	// TODO implement method enforced by interface
	public void doSomething() {
		log.info("AbstractDecorator's method");
		// TODO invocation at the decorated object (our target)
		target.doSomething();

		log.info("End of AbstractDecorator's method");
	}
}
