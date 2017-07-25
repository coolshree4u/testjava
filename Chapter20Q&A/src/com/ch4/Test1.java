package com.ch4;

public class Test1 {
	
	public void test(int a){
		System.out.println("Integer");
	}
	
	public void test(float a){
		System.out.println("Float");
	}
	public static void main(String[] args) {
		Test1 test1=new Test1();
		test1.test(12.34f);
		test1.test(10);
	}

}
