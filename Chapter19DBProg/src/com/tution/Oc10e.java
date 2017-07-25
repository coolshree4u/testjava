package com.tution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Oc10e {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "abhishek", "123");
			
			Statement st1=con.createStatement();
			String s2="delete from emp where eid=400";
			
			int r1=st1.executeUpdate(s2);
			System.out.println(r1+" rows updated");
			
			st1.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
