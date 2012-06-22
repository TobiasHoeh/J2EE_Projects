package de.brockhaus.javase.pattern.adaptor;

/**
 * 
 * @author mbohnen@brockhaus-group.com
 * Copyright by: 
 * Brockhaus Group, Häusserstraße 36, 69115 Heidelberg
 *
 */
//TODO implement class
public class AdaptorFactory
{
	//TODO implement static method to get an adaptor
	public static Adaptor getAdaptor()
	{
		BusinessObject bo = new BusinessObject();
		
		return new AdaptorImpl(bo);
	}
}
