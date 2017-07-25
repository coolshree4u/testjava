package com.tution;

import java.sql.Connection;
import java.sql.DriverManager;

public class Oc1a {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "abhishek", "123");
			if (con != null)
				System.out.println(con);
			System.out.println("Connection established");
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
