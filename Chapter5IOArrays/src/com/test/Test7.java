package com.test;

import java.io.Console;

public class Test7 {
	public static void main(String args[])
	{
		//Console c= new Console();
		//above line will give error
		Console c=null;
		String pw;
		System.out.println("Password : ");
		pw=c.readLine();
		System.out.println("got "+pw);
	}
}
