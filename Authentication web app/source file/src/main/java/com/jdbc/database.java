package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class database {

	private static String url = "jdbc:mysql://localhost:3306/";
	private static String userName = "root";
	private static String password = "Rutvik@8475";

	public static void createDatabase() {
		try {

			Connection conn = DriverManager.getConnection(url, userName, password);

			System.out.println("Connected rutvik");

			Statement stm = conn.createStatement();

			String query = "CREATE DATABASE IF NOT EXISTS ingole";

			stm.execute(query);

			System.out.println("Database ingolecreated successfully");

			conn.close(); // Close the connection when done

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// *************************************************

	public static void createTable() {

		try {

			Connection conn = DriverManager.getConnection(url, userName, password);

			Statement stm = conn.createStatement();

			String query = "CREATE TABLE ingole (id BIGINT PRIMARY KEY AUTO_INCREMENT,firstame VARCHAR(255), lastname VARCHAR(255), phonenumber VARCHAR(20),dob DATE,email VARCHAR(255),password VARCHAR(255))";

			stm.execute(query);

			System.out.println("Table  created successfully");

			conn.close(); // Close the connection when done

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
