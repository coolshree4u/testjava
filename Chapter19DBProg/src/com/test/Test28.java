package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test28 {

	public static void main(String[] args) {
		
		Connection con=null;
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","abhishek","123");
			
			con.setAutoCommit(false);
			
			Statement stmt=con.createStatement();
			String sql="insert into emp1 values(202,'Rita', 'Thane')";
			stmt.executeUpdate(sql);
			con.commit();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
