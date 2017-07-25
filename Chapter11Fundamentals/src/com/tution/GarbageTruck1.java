package com.tution;

public class GarbageTruck1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("GarbageDemo");
		System.out.println(sb.toString());
		System.out.println("Not eligible for Garbage");
		sb=null;
		System.out.println("Sb eligible for Garbage");
		
		
		
		StringBuffer sb1=new StringBuffer("Hello");
		StringBuffer sb2=new StringBuffer("Good Bye");
		System.out.println(sb1.toString());
		System.out.println(sb2.toString());

		sb1=sb2;
		System.out.println(sb1);
	}

}
