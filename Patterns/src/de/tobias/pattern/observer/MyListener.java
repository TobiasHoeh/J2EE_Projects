package de.tobias.pattern.observer;

public class MyListener implements MessageListener {
	public MyListener() {
		MessageBroker.getMessageBroker().registerListener(this);
	}

	@Override
	public void onMessage(Message m) {
		System.out.println(m.getPayload() + m.getTimestamp().toString());

	}
}
