package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test24 {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","abhishek","123"
					+ "");
			String q="Update customer set LastName=? where customerid=?";
			
			PreparedStatement ps=con.prepareStatement(q);
			//ps.setString(0, "Amar");
			//ps.setInt(1, 101);
			//ps.setString(1, "Amar");
			//ps.setInt(2, 101);
			
			ps.setString(1, "Chadda");
			ps.setInt(2, 123);
			
			ps.executeUpdate();
			System.out.println("1 row updated");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}	
	}
}
