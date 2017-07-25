package com.test;

public class Test1 {

	public static void main(String[] args) {
		LambdaFunction lambdaFunction= i-> i*i;
		System.out.println(lambdaFunction.apply(100));
	}
}