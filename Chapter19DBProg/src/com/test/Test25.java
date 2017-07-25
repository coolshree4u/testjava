package com.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test25 {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe");
			Statement stmt = con.createStatement();
			
			String call ="{ CALL REMOVEBOOKS(?,?)}";
			String tR=null;
			int mb=0;
			CallableStatement cs=con.prepareCall(call);
			String titles="%Hero%";
			int nbr;
			
			cs.setInt(1, mb);
			cs.registerOutParameter(1, java.sql.Types.INTEGER);
			cs.execute();
			nbr=cs.getInt(1);
			
			
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
