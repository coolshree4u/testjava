package com.tution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Oc10cc {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "abhishek", "123");
			
			Statement st1=con.createStatement();
			String s2="select eid,ename from emp order by eid";
			
			ResultSet rs=st1.executeQuery(s2);
			
			while (rs.next()) {
				int r=rs.getInt("eid");
				String n=rs.getString("ename");
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