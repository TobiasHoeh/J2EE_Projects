package de.tobias.patterns.service;

import de.tobias.patters.service.data.Person;

public interface PersonService {

	public void createPerson(String vorname, String nachname);

	public Person getPerson(int id);
}
