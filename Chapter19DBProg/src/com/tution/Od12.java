package com.tution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Od12 {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Abhishek", "123");

			PreparedStatement stmt=con.prepareStatement("insert into tab1 values(?,?)");
			
			long t1 = System.currentTimeMillis();

			for (int i = 1; i <= 1000; i++) {
				stmt.setInt(1, i);
				stmt.setInt(2, i*10);
				stmt.executeUpdate();
			}

			long t2 = System.currentTimeMillis();
			System.out.println("Time = " + (t2 - t1));

			stmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
