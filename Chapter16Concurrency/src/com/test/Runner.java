package com.test;

public class Runner implements Runnable{
	String str;
	public Runner(String s) {
		this.str=s;
	}
	@Override
	public void run() {
		System.out.println(str.concat("Runner"));
	}
}
