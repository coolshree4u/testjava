package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test18 {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","abhishek","123");
			Statement stmt = con.createStatement();

			String query = "select * from employee where id=100";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("ename");
				String add = rs.getString("location");
				System.out.println("id " + id + " Name " + name + " Add: " + add);
			}

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
