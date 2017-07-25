package com.test;

public class Commander {

	public static void main(String[] args) {
		String myProp=System.getProperty("prop.custom");
		System.out.println(myProp);
		
		//java -Dprop.custom=gobstopper Commander
	}
}