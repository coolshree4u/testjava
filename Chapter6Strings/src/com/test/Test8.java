package com.test;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="12";
		s.concat("ab"); // made one copy and lost
		s= go(s);
		System.out.println(s);
	}
	static String go(String str){
		str=str.concat("56"); // made one copy and lost
		return str;
	}
}
