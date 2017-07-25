package com.tution;

import java.util.Properties;

public class PP1A {

	public static void main(String[] args) {
		Properties p=System.getProperties();
		System.setProperty("jdbc.drivers", "oracle.jdbc.driver.OracleDriver");
		System.out.println(p.getProperty("java.version"));
		System.out.println(p.getProperty("java.vendor"));
		System.out.println(p.getProperty("java.vendor.url"));
		System.out.println(p.getProperty("java.home"));
		System.out.println(p.getProperty("os.name"));
		System.out.println(p.getProperty("file.separator"));
		System.out.println(p.getProperty("path.separator"));
		System.out.println(p.getProperty("jdbc.drivers"));
	}

}
