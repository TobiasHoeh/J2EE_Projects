package de.brockhaus.javase.pattern.strategy.logistics;

/**
 * 
 * @author mbohnen@brockhaus-group.com
 * Copyright by: 
 * Brockhaus Group, Häusserstraße 36, 69115 Heidelberg
 *
 */
public class BadTransportCalculator
{
	public static final int TRUCK = 0;
	public static final int AIR = 1;
	public static final int TRAIN = 2;
	
	public float getRate(int type, float weight, float distance)
	{
		float rate = 0f;;
		
		switch(type)
		{
			case(BadTransportCalculator.AIR): rate = 100f; //just some calculation
				break;
			case(BadTransportCalculator.TRAIN): rate = 75f; //just some calculation
				break;
			case(BadTransportCalculator.TRUCK): rate = 50f; //just some calculation
				break;		
		}
		return rate;
	}
}
