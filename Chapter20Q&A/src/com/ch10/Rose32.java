package com.ch10;

public class Rose32 {

	public static void main(String[] args) {
		float j=12.5f, c=0.0f, k;
		try {
			System.out.println(j/c);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finally block");
		}
	}

}
