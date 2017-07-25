package com.tution;

public class SBSubstringDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("He is SuperStar");
		String s;
		System.out.println(sb);

		s = sb.substring(6, 11);
		System.out.println(s);
	}
}
