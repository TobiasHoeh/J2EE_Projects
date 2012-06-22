package de.brockhaus.javase.pattern.strategy.logistics;

/**
 * This is the context ...
 * 
 * @author mbohnen@brockhaus-group.com Copyright by: Brockhaus Group,
 *         Häusserstraße 36, 69115 Heidelberg
 * 
 */
public class TransportCalculator {
	private TransportStrategy typeOfTransport;
	private float packageWeight;
	private float distance;

	/**
	 * 
	 * @param strategy
	 *            the concrete strategy to make use of
	 * @param weight
	 *            weight of freight
	 * @param distance
	 *            distance to be transported
	 */
	public TransportCalculator(TransportStrategy strategy, float weight, float distance) {
		this.typeOfTransport = strategy;
		this.distance = distance;
		this.packageWeight = weight;
	}

	public float getCostOfShipping() {
		// TODO return appropriate price (depending on strategy)
		return typeOfTransport.calculateTransport(distance, packageWeight);
	}
}
