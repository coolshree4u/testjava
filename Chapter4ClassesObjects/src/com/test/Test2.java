package com.test;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student bob=new Student();
		Student jian=new Student();
		bob.name="Bob";
		bob.age=19;
		jian=bob;
		jian.name="Jian";
		System.out.println("Bob Name: "+bob.name);
		
	}

}
