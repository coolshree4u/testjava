package com.test;

public class Bar extends Foo{
	public int a =8;
	public void addFive(){
		this.a+=5;
		System.out.println("b");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foo f=new Bar();
		f.addFive();
		System.out.println(f.a);
	}
}
