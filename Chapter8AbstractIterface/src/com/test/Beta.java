package com.test;

public class Beta extends Alpha{
	public void foo() {
		System.out.println("Bfoo");
	}
	public static void main(String args[]){
		Alpha alpha=new Alpha();
		Beta beta=new Beta();
		//Beta beta=(Beta)alpha;
		alpha=beta;
		alpha.foo();
		beta.foo();
	}
}
