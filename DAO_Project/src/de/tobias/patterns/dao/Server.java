package de.tobias.patterns.dao;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {
	public static void main(String[] args) {
		try {
			H2PersonDAO h2 = new H2PersonDAO();
			LocateRegistry.createRegistry(1099);
			Naming.rebind("rmi://127.0.0.1:1099/PersonManager", h2);
			System.out.println("Server is up and running");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
