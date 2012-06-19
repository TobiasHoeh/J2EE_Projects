package de.tobias.patterns.dao;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class H2PersonDAO extends UnicastRemoteObject implements PersonDAO {

	protected H2PersonDAO() throws RemoteException {
		super();
	}

	private Connection con = DataSource.getConnection();

	public Person getPersonById(int id) throws RemoteException {
		Person p = new Person();
		try {
			String sql = "SELECT * FROM PERSON WHERE ID = ?";
			PreparedStatement pStat;
			pStat = con.prepareStatement(sql);
			pStat.setInt(1, id);
			ResultSet res = pStat.executeQuery();

			while (res.next()) {
				p.setId(res.getInt("ID"));
				p.setVorname(res.getString("Vorname"));
				p.setNachname(res.getString("Nachname"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

	public boolean insertPerson(String vorname, String nachname) throws RemoteException {
		String sql = "INSERT INTO PERSON (ID,VORNAME,NACHNAME) VALUES (?,?,?)";
		PreparedStatement pStat;
		Person p = new Person("Hallo", "Tobias");
		try {
			pStat = con.prepareStatement(sql);
			pStat.setInt(1, p.getId());
			pStat.setString(2, p.getVorname());
			pStat.setString(3, p.getNachname());
			return pStat.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
