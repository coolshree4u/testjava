package com.test;

import java.io.PrintStream;

public class Test4 {

	public static void main(String[] args) {
		PrintStream pw=new PrintStream(System.out);
		pw.format("%2$d is bigger than %1$d", 10, 5);
		pw.close();
	}

}
