package de.tobias.pattern.observer;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {
	String payload;
	Date timestamp;

	public Message(String payload, Date timestamp) {
		this.payload = payload;
		this.timestamp = timestamp;
	}

	public String getPayload() {
		return payload;
	}

	public Date getTimestamp() {
		return timestamp;
	}

}
