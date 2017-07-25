package com.test;

public class TestDeclare implements DeclareStuff {

	@Override
	public void doStuff(int t) {
		t+=EASY+ ++t;
		System.out.println("t is "+t);
	}

	public static void main(String args[]){
		int x =5;
		new TestDeclare().doStuff(x);
	}
}
