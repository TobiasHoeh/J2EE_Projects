package de.brockhaus.javase.pattern.command.simple.engine;

import de.brockhaus.javase.pattern.command.simple.Command;

/**
 * @author  mbohnen@brockhaus-group.com  Copyright by:   Brockhaus Group, Häusserstraße 36, 69115 Heidelberg
 */
public class PullThrottleCommand implements Command
{
	/**
     * @uml.property  name="engine"
     * @uml.associationEnd  
     */
	private Engine engine;
	private int howMuch;
	
	public PullThrottleCommand(Engine e)
	{
		this.engine = e;
	}

	/**
     * @param changeRate
     * @uml.property  name="howMuch"
     */
	public void setHowMuch(int changeRate)
    {
    	this.howMuch = changeRate;
    }

	public void execute()
    {
	    this.engine.decreasePower(howMuch);	    
    }

}
