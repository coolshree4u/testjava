package com.test;

import java.io.IOException;

public class Child extends Parent{

	public void process() throws IOException,Exception
	{
		super.process();
		System.out.println("B,");
		throw new IOException();
	}
	
	public static void main(String args[])
	{
		try {
			new Child().process();
		} catch (Exception e) {
			System.out.println("Inside Exception");
		}
	}
}
