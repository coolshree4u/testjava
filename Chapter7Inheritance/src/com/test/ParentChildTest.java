package com.test;

public class ParentChildTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Child().printResult(10));
		new Child().print(10);
		new Child().print(10.2f);
	}
}