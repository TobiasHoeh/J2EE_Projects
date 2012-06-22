package de.brockhaus.javase.pattern.strategy.logistics.client;

import de.brockhaus.javase.pattern.strategy.logistics.TransportCalculator;
import de.brockhaus.javase.pattern.strategy.logistics.TransportStrategy;

/**
 * 
 * @author mbohnen@brockhaus-group.com
 * Copyright by: 
 * Brockhaus Group, Häusserstraße 36, 69115 Heidelberg
 *
 */
public class StrategyClient
{
	public static void main(String[] args)
	{
		try
        {
	        //runtime instantiation of concrete strategy ... (could be any, could be defined elsewhere) 
	        TransportStrategy ts = (TransportStrategy) Class.forName("de.brockhaus.javase.pattern.strategy.logistics.AirTransport").newInstance();
	        //TODO instantiate calculator with strategy of your choice
	        TransportCalculator tc = new TransportCalculator(ts, 100, 1000);
	        System.out.println(tc.getCostOfShipping());
        }
        catch (InstantiationException e)
        {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
        }
	}
}
