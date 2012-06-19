package de.tobias.patterns.dao;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PersonDAO extends Remote {
	public Person getPersonById(int id) throws RemoteException;

	public boolean insertPerson(String vorname, String nachname) throws RemoteException;
}
