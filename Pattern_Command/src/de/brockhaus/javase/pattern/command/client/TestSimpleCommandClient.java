package de.brockhaus.javase.pattern.command.client;

import de.brockhaus.javase.pattern.command.simple.Dashboard;

/**
 * 
 * @author mbohnen@brockhaus-group.com Copyright by: Brockhaus Group,
 *         Häusserstraße 36, 69115 Heidelberg
 * 
 */
public class TestSimpleCommandClient {
	public static void main(String[] args) {
		Dashboard s = new Dashboard();

		try {
			if (args[0].equalsIgnoreCase("ON")) {
				// TODO get the ignition ready
				s.flipUpIgnition();
				// TODO once ignition is on, you should push the throttle for
				// few percent
				s.pushThrottle(10);
			} else if (args[0].equalsIgnoreCase("OFF")) {
				// kill engine by stoping ignition
				s.flipDownIgnition();
				s.pullThrottle(10);
			} else {
				System.out.println("Argument \"ON\" or \"OFF\" is required.");
			}
		} catch (Exception e) {
			System.out.println("Arguments required.");
		}

	}
}
