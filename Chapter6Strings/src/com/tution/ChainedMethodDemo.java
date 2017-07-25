package com.tution;

public class ChainedMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buffer=new StringBuffer("abc");
		System.out.println(buffer);
		buffer.append("def").reverse().insert(3, "--");
		System.out.println(buffer);
		
		
		String x="abc";
		String y=x.concat("xyz").toUpperCase().replace("C","P");
		
		System.out.println(x);
		System.out.println(y);
		
	}
}
