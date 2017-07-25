package com.tution;

public class MM2 {
	static void f1(Integer x) {
		System.out.println("1");
	}

	static void f1(long x, int y) {
		System.out.println("2");
	}

	static void f2(int x, int y) {
		System.out.println("3");
	}

	static void f2(byte... x) {
		System.out.println("4");
	}

	void f3(Byte x, Byte y) {
		System.out.println("5");
	}

	void f3(byte... x) {
		System.out.println("6");
	}

	public static void main(String[] args) {
		int i = 5;
		f1(i);

		byte b = 5;
		f2(b, b);

		new MM2().f3(b, b);

	}
}
