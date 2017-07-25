package com.ch6;

public class Test2 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		String h1="HelloWorld";
		sb.append("Hello").append("World");
		if(h1==sb.toString())
			System.out.println("They Match");
		if(h1.equals(sb.toString()))
			System.out.println("They really Match");
	}

}
