package de.tobias.patterns.rmi.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import de.tobias.patterns.dao.Person;
import de.tobias.patterns.dao.PersonDAO;

public class Client {
	public static void main(String[] args) {
		try {
			PersonDAO dao = (PersonDAO) Naming.lookup("rmi://127.0.0.1:1099/PersonManager");
			Person p;
			p = dao.getPersonById(1);
			System.out.println(p.getVorname());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
