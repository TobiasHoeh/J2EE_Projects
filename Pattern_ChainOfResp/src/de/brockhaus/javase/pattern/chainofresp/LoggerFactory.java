package de.brockhaus.javase.pattern.chainofresp;

/**
 * Singleton ...
 * 
 * @author mbohnen@brockhaus-group.com Copyright by: Brockhaus Group,
 *         Häusserstraße 36, 69115 Heidelberg
 * 
 */
public class LoggerFactory {
	private static final LoggerFactory INSTANCE = new LoggerFactory();

	public static LoggerFactory getLoggerFactory() {
		return INSTANCE;
	}

	public Logger getLogger() {
		// TODO: instantiate three loggers set to different levels
		Logger l1 = new ConsoleLogger(Logger.DEBUG); // DEBUG: lowest level,
														// includes all
		// others
		Logger l2 = new FileLogger(Logger.ERROR); // ERROR highest level
													// excludes all
		// others
		Logger l3 = new EmailLogger(Logger.INFO); // INFO: mid level, includes
													// debug

		// TODO defining chain: l1->l2->l3
		l1.setNext(l2); // after l1, it will be l2
		l2.setNext(l3); // after l2 it will be l3

		// TODO returning the first element of chain
		return l1;
	}
}
