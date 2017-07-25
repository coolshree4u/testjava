package com.tution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Oc10ba {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "abhishek", "123");
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			String s1="insert into emp values(?,?)";
			PreparedStatement p1=con.prepareStatement(s1);
			
			System.out.println("Enter emp id");
			int id=Integer.parseInt(br.readLine());
			
			System.out.println("Enter emp name");
			String n=br.readLine();
			
			p1.setInt(1, id);
			p1.setString(2, n);
			
			int r1=p1.executeUpdate();
			System.out.println(r1+" rows inserted.");
				
			p1.close();
			br.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
