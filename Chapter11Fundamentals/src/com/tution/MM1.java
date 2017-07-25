package com.tution;

public class MM1 {
	static void go(Long x) {
		System.out.println("Long");
	}

	static void go(Float x) {
		System.out.println("Float");
	}

	static void go(short x) {
		System.out.println("short");
	}

	static void go(int x) {
		System.out.println("int");
	}

	static void go(String x) {
		System.out.println("String");
	}

	static void go(double... d) {
		System.out.println("Double");
	}
	public static void main(String[] args) {
		byte b = 10;
		go(b);
		short s = 20;
		go(s);
		int i = 30;
		go(i);
		long l = 40;
		go(l);
		float f = 1.23f;
		go(f);
		double d = 2.34;
		go(d);
	}
}
