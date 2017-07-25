package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test15 {

	public static void main(String[] args) {

		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe");
			
			String query="Update customer set email='abhishek@gmail.com' where customerid=123";
			Statement stmt=con.createStatement();
			int result=stmt.executeUpdate("Update food set amount=amount+1");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
