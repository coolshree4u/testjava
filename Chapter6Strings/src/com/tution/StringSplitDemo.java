package com.tution;

public class StringSplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numbers="10 20 30 40 50";
		
		//String[] num=numbers.split(" ");
		String[] num=numbers.split("\\s");
		int a,b,c;
		a=Integer.parseInt(num[0]);
		b=Integer.parseInt(num[1]);
		c=Integer.parseInt(num[2]);
		
		System.out.println("Addition of the elements in the string is "+(a+b+c));
		
		
		String whiteSpace="10w20w30w40w50";
		
		String[] numWhiteSpace=whiteSpace.split("w");
		a=Integer.parseInt(numWhiteSpace[0]);
		b=Integer.parseInt(numWhiteSpace[1]);
		c=Integer.parseInt(numWhiteSpace[2]);
		
		System.out.println("Addition of the elements in the string is "+(a+b+c));
		
		String commaSeprated="10,20,30,40,50";
		
		String[] numCommaSeprated=commaSeprated.split(",");
		a=Integer.parseInt(numCommaSeprated[0]);
		b=Integer.parseInt(numCommaSeprated[1]);
		c=Integer.parseInt(numCommaSeprated[2]);
		
		System.out.println("Addition of the elements in the string is "+(a+b+c));
	}
}
