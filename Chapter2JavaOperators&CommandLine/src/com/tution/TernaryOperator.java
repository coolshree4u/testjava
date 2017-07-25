package com.tution;

public class TernaryOperator {

	public static void main(String[] args) {
		int n=3;
		String status=(n<4)?"Ok":"Tata";
		System.out.println(status);
		
		int a=10;
		int b=5;
		status = (b<4)?"Ok":(a>8)?"Tata":"Bye Bye";
		System.out.println(status);
	}
}