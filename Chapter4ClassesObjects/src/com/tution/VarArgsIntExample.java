package com.tution;

public class VarArgsIntExample {

	public static void sum(int ... a){
		int sum=0;
		for (int i : a) {
			sum=sum+i;
		}
		System.out.println("The sum is "+sum);
	}
	public static void main(String[] args) {
		sum(1,2,3,4);
		sum(1,2);
	}
}