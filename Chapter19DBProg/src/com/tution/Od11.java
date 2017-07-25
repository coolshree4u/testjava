package com.tution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Od11 {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Abhishek", "123");
			Statement smt = con.createStatement();

			long t1 = System.currentTimeMillis();

			for (int i = 1; i <= 1000; i++) {
				smt.executeQuery("insert into tab1 values(" + i + "," + i * 10 + ")");
			}

			long t2 = System.currentTimeMillis();
			System.out.println("Time = " + (t2 - t1));

			smt.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
