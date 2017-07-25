package com.tution;

public class Add3CommandLine {

	public static void main(String[] args) {
		int a,b,c;
		double average;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		average=(a+b+c)/3.0;
		System.out.println("Average :  "+average);
	}
}