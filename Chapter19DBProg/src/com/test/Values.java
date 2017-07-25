package com.test;

import java.util.Properties;

public class Values {

	public static void main(String[] args) {
		Properties p=System.getProperties();
		
		p.setProperty("myProp", "myValue");
		
		System.out.println(p.getProperty("cmdProp")+" ");
		System.out.println(p.getProperty("myProp")+" ");
		System.out.println(p.getProperty("noProp")+" ");
		
		p.setProperty("cmdProp", "newValue");
		System.out.println(p.getProperty("cmdProp"));
		
		//java -DcmdProp=cmdValue Values
	}

}
