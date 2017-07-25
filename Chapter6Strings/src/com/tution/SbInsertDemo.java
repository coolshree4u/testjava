package com.tution;

public class SbInsertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Java is Kool");
		System.out.println(sb.toString());
		
		sb.insert(8, "Super-");
		System.out.println(sb.toString());
	}
}