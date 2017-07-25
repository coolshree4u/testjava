package com.tution;

public class SBReplaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("He is Technical guru of Automation");
		System.out.println(sb);
		
		sb.replace(3, 5, "was");
		System.out.println(sb);
		
		sb.replace(7, 16, "Coding");
		System.out.println(sb);
		
		String subString=sb.substring(22);
		System.out.println(subString);
	}

}
