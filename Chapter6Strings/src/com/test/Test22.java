package com.test;

public class Test22 {
	public static void main(String args[]) {
		String stuff="of coursewyeswnowmaybe";
		String [] values=stuff.split("w");
		for (String string : values) {
			System.out.println(string);
		}
		
		String test="a1b2c3";
		String [] decimal=test.split("\\d");
		for (String str : decimal) {
			System.out.println(str);
		}
		
		String test2="This is a test";
		String[] tokens=test.split("\\s");
		System.out.println(tokens.length);
	}
}