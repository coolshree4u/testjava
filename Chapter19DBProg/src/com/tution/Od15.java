package com.tution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Od15 {

	public static void main(String[] args) {
		Connection con=null;
		try {
			
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Abhishek", "123");

			con.setAutoCommit(false);

			Statement stmt = con.createStatement();

			String sql = "insert into employee values(100,'Rahul','Dadar')";
			stmt.executeUpdate(sql);

			sql = "insert into employee values(101,'Romy','Worli')";
			stmt.executeUpdate(sql);

			sql = "insert into employee values(102,'Atul','Colaba')";
			stmt.executeUpdate(sql);

			con.commit();
			System.out.println("Transaction Done Successfully");
			con.close();

			
		}catch (SQLException e) {
			System.out.println("Transaction Error");
			try {
				con.rollback();
			} catch (SQLException e2) {
				System.out.println("Rollback Error");
			}
		}
		System.out.println("Rollback done successfully");
	}

}
