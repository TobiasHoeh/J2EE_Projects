package de.brockhaus.javase.pattern.command.simple.engine;

import java.util.logging.Logger;

/**
 * 
 * @author mbohnen@brockhaus-group.com
 * Copyright by: 
 * Brockhaus Group, Häusserstraße 36, 69115 Heidelberg
 *
 */
public class Engine
{
	private Logger log = Logger.getLogger(this.getClass().getName());
	private int powerInPercent;
	
	public void increasePower(int percent)
	{
		this.powerInPercent = this.powerInPercent + percent;
		log.info("Power is now: " + this.powerInPercent);
	}
	
	public void decreasePower(int percent)
	{
		this.powerInPercent = this.powerInPercent - percent;
		log.info("Power is now: " + this.powerInPercent);
	}
}
