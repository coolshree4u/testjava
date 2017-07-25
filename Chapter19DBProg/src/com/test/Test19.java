package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test19 {

	public static void main(String[] args) {

		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","abhishek","123");
			Statement stmt = con.createStatement();
			System.out.println("here");
			String query = "select * from item";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println("here");
				int id = rs.getInt("id");
				String desc = rs.getString("descrip");
				double pr = rs.getDouble("Price");	
				int qty = rs.getInt("quantity");
				System.out.println("ID " + id + " Description " + desc + " Price " + pr + " Quantity " + qty);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
