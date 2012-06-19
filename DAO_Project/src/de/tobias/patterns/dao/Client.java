package de.tobias.patterns.dao;

import java.rmi.RemoteException;

public class Client {
	public static void main(String[] args) {
		PersonDAO dao;
		try {
			dao = new H2PersonDAO();
			Person p = dao.getPersonById(1);
			System.out.println(p.getVorname());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
