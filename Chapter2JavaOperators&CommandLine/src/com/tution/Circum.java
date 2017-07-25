package com.tution;

public class Circum {

	public static void main(String[] args) {
		double r,c;
		final double PI=3.14d;
		r=Double.parseDouble(args[0]);
		c=2*PI*r;
		System.out.println("Circumference of radius "+r+" is "+c);
	}
}
