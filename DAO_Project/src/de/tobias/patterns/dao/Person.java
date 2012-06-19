package de.tobias.patterns.dao;

import java.io.Serializable;

public class Person implements Serializable {
	private int id;
	private String vorname;
	private String nachname;
	private static int counter;

	public Person() {

	}

	public Person(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.id = counter;
		counter++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
}
