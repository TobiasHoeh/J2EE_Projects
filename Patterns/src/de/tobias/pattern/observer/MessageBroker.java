package de.tobias.pattern.observer;

import java.util.Iterator;
import java.util.Vector;

public class MessageBroker {

	public Vector<MessageListener> listenerList = new Vector<MessageListener>();
	public static MessageBroker INSTANCE = new MessageBroker();

	private MessageBroker() {
		// lazy
	}

	public static MessageBroker getMessageBroker() {
		return INSTANCE;
	}

	public void registerListener(MessageListener listener) {
		listenerList.add(listener);
	}

	public void receiveMessage(Message m) {
		notifyListeners(m);
	}

	private void notifyListeners(Message m) {
		for (Iterator iterator = listenerList.iterator(); iterator.hasNext();) {
			MessageListener listener = (MessageListener) iterator.next();
			listener.onMessage(m);

		}
	}
}
