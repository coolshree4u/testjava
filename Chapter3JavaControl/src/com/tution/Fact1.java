package com.tution;

public class Fact1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num,fact=1;
		num=5;
		
		for (i = 1; i <= num; i++) {
				fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is "+fact);
	}

}
