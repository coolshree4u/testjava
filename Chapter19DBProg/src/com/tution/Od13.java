package com.tution;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Types;

public class Od13 {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Abhishek", "123");

			CallableStatement stmt=con.prepareCall("{call getRowCount(?)}");
			
			stmt.registerOutParameter(1, Types.INTEGER);
			stmt.execute();
			
			int r=stmt.getInt(1);
			System.out.println("Total rows = "+r);
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}