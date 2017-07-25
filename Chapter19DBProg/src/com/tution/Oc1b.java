package com.tution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Oc1b {

	public static void main(String[] args) {
		try {
				System.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
			Class.forName(System.getProperty("driver"));
			//System.getProperty("driver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "abhishek", "123");
			if (con != null)
				System.out.println(con);
			System.out.println("Connection established.....");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
