package com.ch19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.sql.Statement;

public class JdbcDemo1 {

	public static void main(String[] args) {
		try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","abhishek","123");
			
			Statement stmt=con.createStatement();
			con.setAutoCommit(false);
			stmt.executeUpdate("insert into employees values(1,'sam')");
			Savepoint s1=con.setSavePoint("Point1");
			stmt.executeUpdate("insert into employees values(2,'Abhi')");
			con.rollback();
			stmt.executeUpdate("insert into employees values(3,'John')");
			con.setAutoCommit(true);
			stmt.executeUpdate("insert into employees values(4,'jack')");
			
			ResultSet rs=stmt.executeQuery("Select * from employees");
			while (rs.next()){
				System.out.println(rs.getString(1)+" "+rs.getString(2));
			}
			con.commit();
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
