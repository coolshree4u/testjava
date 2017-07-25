package com.tution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Oc10a {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "abhishek", "123");
			
			Statement s1=con.createStatement();
			String s2="create table emp(eid integer primary key, ename varchar2(200))";
			s1.executeUpdate(s2);
			s1.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
