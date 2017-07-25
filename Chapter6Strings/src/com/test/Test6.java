package com.test;

public class Test6 {
	
	public static void test(String str){
		int check=4;
		if(check==str.length()){
			System.out.println(str.charAt(check-=1)+",");
		}else{
			System.out.println(str.charAt(0)+",");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test("four");
		test("three");
		test("abcd");
	}

}
