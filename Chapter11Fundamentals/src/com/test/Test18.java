package com.test;

public class Test18 {
	public static void display(long ivar) {
		System.out.println(ivar);
	}

	public static void display(Integer ivar) {
		System.out.println(ivar * ivar);
	}

	public static void display(Long ivar) {
		System.out.println(ivar * ivar * ivar);
	}

	public static void main(String[] args) {
		int var = 2;
		new Test18().display(var);

	}
}
