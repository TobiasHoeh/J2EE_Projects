package de.brockhaus.javase.pattern.command.simple;

import de.brockhaus.javase.pattern.command.simple.engine.Engine;
import de.brockhaus.javase.pattern.command.simple.engine.PullThrottleCommand;
import de.brockhaus.javase.pattern.command.simple.engine.PushThrottleCommand;
import de.brockhaus.javase.pattern.command.simple.ignition.Ignition;
import de.brockhaus.javase.pattern.command.simple.ignition.IgnitionOffCommand;
import de.brockhaus.javase.pattern.command.simple.ignition.IgnitionOnCommand;

/**
 * 
 * @author mbohnen@brockhaus-group.com Copyright by: Brockhaus Group,
 *         Häusserstraße 36, 69115 Heidelberg
 * 
 */
public class Dashboard {
	private Command flipUpIgnitionCommand;
	private Command flipDownIgnitionCommand;
	private PushThrottleCommand pushThrottleCommand;
	private PullThrottleCommand pullThrottleCommand;

	public Dashboard() {
		// so the pilot turned the key ..
		this.init();
	}

	// TODO provide switch to flip up ... (Ignition will be on)
	public void flipUpIgnition() {
		// TODO execute command
		this.flipUpIgnitionCommand.execute();
	}

	// TODO provide switch to flip up ... (Ignition will be off)
	public void flipDownIgnition() {
		this.flipDownIgnitionCommand.execute();

	}

	public void pushThrottle(int percent) {
		this.pushThrottleCommand.setHowMuch(percent);
		this.pushThrottleCommand.execute();
	}

	public void pullThrottle(int percent) {
		this.pullThrottleCommand.setHowMuch(percent);
		this.pullThrottleCommand.execute();
	}

	private void init() {
		// TODO instantiate Ignition
		Ignition l = new Ignition();
		// TODO set command to switch ignition on
		this.flipDownIgnitionCommand = new IgnitionOffCommand(l);
		// TODO set command to switch ignition off
		this.flipUpIgnitionCommand = new IgnitionOnCommand(l);

		// TODO implement the things to make the engine run faster/slower
		Engine e = new Engine();
		this.pullThrottleCommand = new PullThrottleCommand(e);
		this.pushThrottleCommand = new PushThrottleCommand(e);
	}
}
