package de.brockhaus.javase.pattern.strategy.logistics;

/**
 * "concrete" strategy
 * 
 * @author mbohnen@brockhaus-group.com Copyright by: Brockhaus Group,
 *         Häusserstraße 36, 69115 Heidelberg
 * 
 */
// TODO implement appropriate interface
public class AirTransport implements TransportStrategy {
	private float pricePerMile = 1.5f;
	private float serviceCharge = 55;
	private float pricePerKG = 3.25f;

	public float calculateTransport(float distance, float weight) {
		return distance * this.pricePerMile + weight * this.pricePerKG + this.serviceCharge;
	}
}
