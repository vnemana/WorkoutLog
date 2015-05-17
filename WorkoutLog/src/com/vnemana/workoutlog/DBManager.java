package com.vnemana.workoutlog;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {

	private Connection c;

	public DBManager(String dbName) {
		c = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:"+dbName+".db");
		} catch (Exception e) {
			System.err.println(e.getClass().getName()+ ":" + e.getMessage());
		}
	}

}
