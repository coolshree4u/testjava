package com.tution;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class Od14 {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Abhishek", "123");

			CallableStatement stmt = con.prepareCall("{call getB(?,?)}");
			stmt.setInt(1, 12);
			stmt.registerOutParameter(2, Types.INTEGER);
			
			stmt.execute();
			int r=stmt.getInt(2);
			System.out.println("Result = "+r);
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
