package com.test;

public class NullPointerTest {

	public static void main(String[] args) {
		try {
			args = null;
			args[0] = "Test";

		} catch (NullPointerException ae) {
			System.out.println("Null pointer exception");
		} catch (Exception e) {
			System.out.println("Inside Main Exception");
		}
	}

}
