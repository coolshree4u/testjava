package com.test;

public class Test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="spot";
		int age=4;
		String str="My dog "+name+" is "+age;
		System.out.println(str);
		
		StringBuffer sb=new StringBuffer();
		sb.append("My dog "+name+" is "+age);
		System.out.println(sb);
		/*sb.insert(1,"My dog ").append(name+" is "+age);
		System.out.println(sb);*/
		
	}
}