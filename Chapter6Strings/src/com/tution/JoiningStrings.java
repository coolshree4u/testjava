package com.tution;

public class JoiningStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=String.join(" and " , "LinkedIn","Microsoft");
		System.out.println(s1);
		
		String[] biggies={"Apples","Google", "Amazon"};
		String s2=String.join(",", biggies);
		System.out.println(s2);
		
		String[] smallies={"MicroMax","RedMi",null};
		String s3=String.join(null, smallies);
		System.out.println(s3);
	}
}