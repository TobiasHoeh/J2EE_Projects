package de.brockhaus.javase.pattern.strategy.logistics;

/**
 * "concrete" strategy
 * 
 * @author mbohnen@brockhaus-group.com
 * Copyright by: 
 * Brockhaus Group, Häusserstraße 36, 69115 Heidelberg
 *
 */
//TODO implement appropriate interface
public class TruckTransport 
{
	private float pricePerMile = 0.5f;
	private float serviceCharge = 15;
	private float pricePerKG = 1.25f;

	public float calculateTransport(float distance, float weight)
    {
	    return distance * this.pricePerMile + weight * this.pricePerKG + this.serviceCharge;
    }

}
