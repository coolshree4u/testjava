package com.ch3;

public class Test2 {

	public static void main(String[] args) {
		int num=5;
		//int sum;
		int sum=0;
		do {
			sum+=num;
			
		} while ((num--) >1);
		System.out.println("The sum is "+sum+".");
	}

}
