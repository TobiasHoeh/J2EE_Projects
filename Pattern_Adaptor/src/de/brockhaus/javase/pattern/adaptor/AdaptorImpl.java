package de.brockhaus.javase.pattern.adaptor;

/**
 * Implementation of wrapper
 * 
 * @author mbohnen@brockhaus-group.com Copyright by: Brockhaus Group,
 *         Häusserstraße 36, 69115 Heidelberg
 * 
 */
// TODO implement interface
public class AdaptorImpl implements Adaptor {
	BusinessObject callee = null;

	// TODO implement constructor
	public AdaptorImpl(BusinessObject bo) {
		this.callee = bo;
	}

	public void doSomething() {
		// TODO implement chaining to BusinessObject
		this.callee.someMethod();
	}
}
