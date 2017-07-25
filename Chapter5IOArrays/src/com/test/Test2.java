package com.test;

import java.io.PrintStream;

public class Test2 {

	public static void main(String[] args) {
		PrintStream pw= new PrintStream(System.out);
		double d =2.73258;
		int x=3;
		pw.format("%4.2f %s %d %n", d," is almost ",x);
		
	}

}