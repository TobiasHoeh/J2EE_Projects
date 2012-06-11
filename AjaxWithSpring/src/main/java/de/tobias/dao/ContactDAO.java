package de.tobias.dao;

import java.util.List;

import de.tobias.entity.Contact;

public interface ContactDAO {

	public void addContact(Contact contact);

	public List<Contact> listContact();

	public void removeContact(Integer id);
}
