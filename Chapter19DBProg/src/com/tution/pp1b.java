package com.tution;

import java.util.Properties;

public class pp1b {
	public static void main(String args[]){
		Properties p=System.getProperties();
		String s1=p.getProperty("jdbcd.drivers");
		System.out.println(s1);
		
		System.out.println(System.getProperties().getProperty("jdbc.driver"));
		System.out.println(System.getProperty("jdbc.drivers"));
		
		p.setProperty("jdbc.drivers", "com.mysql.jdbc.Driver");
		System.out.println(p.getProperty("jdbc.drivers"));
	
		System.out.println(System.getProperty("jdbc"));
		
		p.setProperty("file.separator", "/");
		System.out.println(p.getProperty("file.separator"));
		
		System.out.println(p.getProperty("path.separator"));
	}
}	