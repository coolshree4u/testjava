package com.test;

public class Two {

	public static void doStuff() {
		if(Math.random()>0.5)
			throw new RuntimeException();
		doMoreStuff();
		System.out.println("3");
		
	}

	public static void doMoreStuff() {
		System.out.println("4");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			doStuff();
			System.out.println("1");
		}catch (Exception e) {
			System.out.println("2");
		}
	}

}
