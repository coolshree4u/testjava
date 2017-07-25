package com.tution;

public class ReplaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Bye Bye Bye !!";
		String s2=s1.replace('y', 'e');
		
		System.out.println(s1);
		System.out.println(s2);
		
		String s3=s1.replace("By", "e");
		System.out.println(s1);
		System.out.println(s3);
	}

}
