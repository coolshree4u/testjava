package com.tution;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c=30;
		
		System.out.println("(a<b)&(c>b) "+((a<b)&(c>b)));
		System.out.println("(a>b)&(++c>b) "+((a>b)&(++c>b)));
		System.out.println("(a>b)&&(++c>b) "+((a>b)&&(++c>b)));
		System.out.println("(a>b)|(++c>b) "+((a>b)|(++c>b)));
		System.out.println("(a>b)||(++c>b) "+((a>b)||(++c>b)));
		System.out.println("(a<b)||(++c>b) "+((a<b)||(++c>b)));
		System.out.println("(a<b)^(++c>b) "+((a<b)^(++c>b)));
		System.out.println("(a>b)^(++c>b) "+((a>b)^(++c>b)));
	}

}
