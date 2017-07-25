package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test14 {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Abhishek", "12345");
			
			String query="Update customer set email='abhishek@gmail.com' where customerid=123";
			Statement stmt=con.createStatement();
			stmt.executeQuery(query);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
