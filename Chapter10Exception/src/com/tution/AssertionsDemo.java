package com.tution;

public class AssertionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=Integer.parseInt(args[0]);
		assert age>=18:"You can't vote";
		System.out.println("You can vote");
	}

}
