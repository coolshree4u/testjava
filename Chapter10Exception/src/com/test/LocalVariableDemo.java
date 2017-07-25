package com.test;

public class LocalVariableDemo {

	public static void main(String[] args) {
		parse("Invalid");
	}

	private static void parse(String string) {
		try{
			float f =Float.parseFloat(string);
			
		}catch (Exception e) {
			//System.out.println(f);  //Local Variable F cannot be used 
			//Jeena Yaha Marna Yaha
			System.out.println("Inside Exception");
		}
		
	}
	
}
