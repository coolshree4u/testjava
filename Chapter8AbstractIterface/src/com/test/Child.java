package com.test;

public class Child extends Parent {
	public void sayHi(){
		System.out.println("Hello");
	}
	
	public static void main(String args[]){
		Parent p=new Child();
		p.sayHi();
	}
}