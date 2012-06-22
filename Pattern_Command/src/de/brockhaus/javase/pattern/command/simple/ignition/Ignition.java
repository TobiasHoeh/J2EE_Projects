package de.brockhaus.javase.pattern.command.simple.ignition;

import java.util.logging.Logger;

/**
 * @author  mbohnen@brockhaus-group.com  Copyright by:   Brockhaus Group, Häusserstraße 36, 69115 Heidelberg
 */
public class Ignition 
{

	private boolean state = false;
	private Logger log = Logger.getLogger(this.getClass().getName()); 
	 
    public Ignition() 
    {
    	
    }

    public void turnOn() 
    {
    	this.state = true;
    	log.info("The ignition is on");
    }

    public void turnOff() 
    {
    	this.state = false;
    	log.info("The ignition is off");
    }
    
  
    public boolean getState()
    {
    	return this.state;
    }
}

