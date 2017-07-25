package com.test;

public class ReturnDemo {
	public static String getName() {
		String temp = new String("hii");
		return temp;
	}

	public static void main(String[] args) {
		String result;
		result = getName();
		System.out.println(result);
		result = null;
		System.gc();
	}
}
