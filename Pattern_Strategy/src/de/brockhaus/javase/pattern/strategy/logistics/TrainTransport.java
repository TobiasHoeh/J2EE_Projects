package de.brockhaus.javase.pattern.strategy.logistics;

/**
 * "concrete" strategy
 * 
 * @author mbohnen@brockhaus-group.com Copyright by: Brockhaus Group,
 *         Häusserstraße 36, 69115 Heidelberg
 * 
 */
// TODO implement appropriate interface
public class TrainTransport implements TransportStrategy {
	private float pricePerMile = 0.25f;
	private float serviceCharge = 10;
	private float pricePerKG = 1.25f;

	// TODO implement missing method
	public float calculateTransport(float distance, float weight) {
		return distance * this.pricePerMile + weight * this.pricePerKG + this.serviceCharge;
	}

}
