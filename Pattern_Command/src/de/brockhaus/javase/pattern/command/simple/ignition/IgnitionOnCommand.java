package de.brockhaus.javase.pattern.command.simple.ignition;

import de.brockhaus.javase.pattern.command.simple.Command;

/**
 * The command to switch ignition on
 * 
 * @author mbohnen@brockhaus-group.com Copyright by: Brockhaus Group,
 *         Häusserstraße 36, 69115 Heidelberg
 */
// TODO implement appropriate interface
public class IgnitionOnCommand implements Command {

	private Ignition ignition;

	// TODO set the thing this command is working on
	public IgnitionOnCommand(Ignition i) {
		this.ignition = i;
	}

	// TODO go for it!
	public void execute() {
		this.ignition.turnOn();
	}
}
