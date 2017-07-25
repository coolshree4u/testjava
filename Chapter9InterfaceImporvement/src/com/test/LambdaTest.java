package com.test;

public class LambdaTest {

	public static void main(String[] args) {
		DontDoAnything beIdle=()-> System.out.println("be idle");
		beIdle.doNothing();
	}
}