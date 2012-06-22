package de.brockhaus.javase.pattern.chainofresp;

/**
 * 
 * @author mbohnen@brockhaus-group.com Copyright by: Brockhaus Group,
 *         Häusserstraße 36, 69115 Heidelberg
 * 
 */
// TODO extend appropriate superclass
public class FileLogger extends Logger {
	/** Constructor with information of the level responsible for */
	// TODO implement constructor
	public FileLogger(int level) {
		super(level);
	}

	@Override
	/** individual treatment of writing a message */
	// TODO implement method
	protected void writeMessage(String msg) {
		System.out.println("Writing to File: " + msg);
	}
}
