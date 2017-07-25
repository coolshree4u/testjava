package com.tution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Oc10c {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "abhishek", "123");
			
			Statement st1=con.createStatement();
			String s2="select * from emp";
			
			ResultSet rs=st1.executeQuery(s2);
			
			while (rs.next()) {
				int r=rs.getInt(1);
				String n=rs.getString(2);
				System.out.println(r+" "+n);
			}
			rs.close();
			st1.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
