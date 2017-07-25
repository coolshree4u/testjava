package com.test;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Wham Bammmmm";
		String str2=new String("Wham Bammmmm");
		
		if(str1==str2)
			System.out.println("They match");
		
		if(str1.equals(str2))
			System.out.println("They really match");
		
		
		//String s1=String.join("and",'a','b','c');
		//Cant join the characters requires string
		String s1=String.join("and","a","b","c");
		System.out.println(s1);
	}
}