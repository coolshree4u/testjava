package com.ch4;

public class Test3 {

	private final int id;
	public Test3(int id) {
		this.id=id;
	}
	
	public void updateId(int newId){
		//id=newId;
		//this 
	}
	public static void main(String[] args) {
		Test3 test3=new Test3(42);
		test3.updateId(69);
		System.out.println(test3.id);
	}
}