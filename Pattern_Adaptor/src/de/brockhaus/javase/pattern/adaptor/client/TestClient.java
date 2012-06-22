package de.brockhaus.javase.pattern.adaptor.client;

import de.brockhaus.javase.pattern.adaptor.Adaptor;
import de.brockhaus.javase.pattern.adaptor.AdaptorFactory;

/**
 * For whatever reason we can't change ...
 * 
 * @author mbohnen@brockhaus-group.com Copyright by: Brockhaus Group,
 *         Häusserstraße 36, 69115 Heidelberg
 * 
 */
public class TestClient {
	public static void main(String[] args) {
		// TODO get an Adaptor
		Adaptor remoteSystem = AdaptorFactory.getAdaptor();
		// ... this line
		remoteSystem.doSomething();

	}

}
