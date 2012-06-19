package de.tobias.patterns.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataSource {
	private static String driver = "org.h2.Driver";
	private static String dbURL = "jdbc:h2:tcp://localhost/C:\\Users\\D053441\\data";
	private static String username = "sa";
	private static String password = "sa";

	public static Connection getConnection() {
		try {
			Class.forName(driver);
			return DriverManager.getConnection(dbURL, username, password);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
}
