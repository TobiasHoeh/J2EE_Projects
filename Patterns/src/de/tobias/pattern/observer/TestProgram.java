package de.tobias.pattern.observer;

import java.util.Date;

public class TestProgram {
	public static void main(String[] args) {
		MyListener listener1 = new MyListener();
		MyListener listener2 = new MyListener();

		MessageBroker broker = MessageBroker.getMessageBroker();

		broker.receiveMessage(new Message("Hallo", new Date(System
				.currentTimeMillis())));
		broker.receiveMessage(new Message("Hallo2", new Date(System
				.currentTimeMillis())));

	}
}
