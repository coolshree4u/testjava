package com.test;

public class Test19 {

	public static void go(Long n) {
		System.out.println("Long");
	}

	public static void go(short n) {
		System.out.println("short");
	}

	public static void go(int n) {
		System.out.println("int");
	}

	public static void main(String[] args) {
		short y = 6;
		long z = 7;
		go(y);
		go(z);
	}
}
