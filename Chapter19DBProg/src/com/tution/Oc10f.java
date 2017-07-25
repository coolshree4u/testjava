package com.tution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Oc10f {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "abhishek", "123");
			
			Statement st1=con.createStatement();
			String s2="drop table emp";
			
			st1.executeUpdate(s2);
			st1.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
