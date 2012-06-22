package de.brockhaus.javase.pattern.chainofresp.client;

import de.brockhaus.javase.pattern.chainofresp.Logger;
import de.brockhaus.javase.pattern.chainofresp.LoggerFactory;

/**
 * 
 * @author mbohnen@brockhaus-group.com Copyright by: Brockhaus Group,
 *         Häusserstraße 36, 69115 Heidelberg
 * 
 */
public class TestClient {
	public static void main(String[] args) {
		Logger log = LoggerFactory.getLoggerFactory().getLogger();

		// only writing to console due to lowest level
		log.dealWithMessage("Entering function.", Logger.DEBUG);

		// writing through two loggers as INFO includes DEBUG
		log.dealWithMessage("Step completed.", Logger.INFO);

		// now writing to all
		log.dealWithMessage("An error has occurred.", Logger.ERROR);

	}

}
