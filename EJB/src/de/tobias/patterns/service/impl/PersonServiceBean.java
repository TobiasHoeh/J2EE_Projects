package de.tobias.patterns.service.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import de.tobias.patterns.service.PersonService;
import de.tobias.patters.service.data.Person;

@Stateless
@Remote(PersonService.class)
public class PersonServiceBean implements PersonService {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void createPerson(String vorname, String nachname) {
		Person p = new Person(vorname, nachname);
		entityManager.persist(p);
	}

	@Override
	public Person getPerson(int id) {
		Person p = entityManager.find(Person.class, id);
		return p;
	}
}
