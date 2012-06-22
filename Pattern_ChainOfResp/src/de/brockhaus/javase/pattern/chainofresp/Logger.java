package de.brockhaus.javase.pattern.chainofresp;

/**
 * 
 * @author mbohnen@brockhaus-group.com Copyright by: Brockhaus Group,
 *         Häusserstraße 36, 69115 Heidelberg
 * 
 */
public abstract class Logger {
	// levels available
	public static final int ERROR = 0;
	public static final int INFO = 1;
	public static final int DEBUG = 2;

	/** current level */
	protected int level;

	/** next element in the chain of responsibility */
	protected Logger next;

	public Logger(int level) {
		this.level = level;
	}

	/** defining who is next */
	public Logger setNext(Logger l) {
		this.next = l;
		return l;
	}

	/** dealing with the message, subclasses can't overwrite */
	public final void dealWithMessage(String msg, int priority) {
		// is it mine as the level I'm responsible of is greater
		// or equal than the message level?
		if (this.level >= priority) {
			this.writeMessage(msg);
		}

		// go further
		if (next != null) {
			// TODO chain to next one ...
			next.dealWithMessage(msg, priority);
		}
	}

	/** to be implemented by the concrete loggers */
	abstract protected void writeMessage(String msg);

}
