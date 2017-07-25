package com.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Abhishek", "12345");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
