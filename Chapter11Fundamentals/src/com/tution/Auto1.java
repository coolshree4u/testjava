package com.tution;

public class Auto1 {

	public static void main(String[] args) {
		Integer n1 = new Integer(25);
		System.out.println("Value of n1 b4 incr" + n1);
		int x = n1.intValue();
		x++;
		n1 = new Integer(x);
		System.out.println("Value of n1 after incr" + n1);

	}
}
