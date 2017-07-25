package com.ch2;

public class Test1 {

	public static void main(String[] args) {
		int x = 7;
		int y = 6 * x++;
		System.out.println("y=" + y);
		int a = 7;
		int b = 6 * ++a;
		System.out.println("b= " + b);

	}
}