package com.test;

public class Outer {
	private int x=5;
	protected class Inner{
		//public static int x=10;
		public int x=10;
		public void go(){
			System.out.println(x);
		}
	}
}