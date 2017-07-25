package com.test;

public class Test20 {
	public static void main(String[] args) {
		short a1 = 6;
		new Test20().go(a1);
		new Test20().go(new Integer(7));

	}

	void go(Short x) {
		System.out.println("s");
	}

	void go(long x) {
		System.out.println("L");
	}

	void go(int x) {
		System.out.println("i");
	}

	void go(Number n) {
		System.out.println("n");
	}

}
