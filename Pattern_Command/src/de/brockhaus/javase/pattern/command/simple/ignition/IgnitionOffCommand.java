package de.brockhaus.javase.pattern.command.simple.ignition;

import de.brockhaus.javase.pattern.command.simple.Command;

/**
 * @author mbohnen@brockhaus-group.com Copyright by: Brockhaus Group,
 *         Häusserstraße 36, 69115 Heidelberg
 */
// TODO implement appropriate interface
public class IgnitionOffCommand implements Command {

	private Ignition ignition;

	// TODO set the thing this command is working on
	public IgnitionOffCommand(Ignition i) {
		this.ignition = i;
	}

	// TODO go for it!
	public void execute() {
		this.ignition.turnOff();
	}
}
