package de.brockhaus.javase.pattern.strategy.logistics;

/**
 * "abstract" strategy (which is an interface in our case)
 * 
 * @author mbohnen@brockhaus-group.com Copyright by: Brockhaus Group,
 *         Häusserstraße 36, 69115 Heidelberg
 * 
 */
public interface TransportStrategy {
	// TODO implement the method for all strategies:
	// float calculateTransport(float distance, float weight)
	public float calculateTransport(float distance, float weight);
}
