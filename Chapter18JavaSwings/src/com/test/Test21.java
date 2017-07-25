package com.test;

public class Test21 {

	public static void main(String[] args) {
		System.out.println(new TestA(){
			public String toString(){
				return "test";
			}
		});
	}

}
