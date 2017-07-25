package com.ch8;

public class Base {
	public static final String Foo="foo";
	public static void main(String args[]){
		Base b=new Base();
		Sub s=new Sub();
		
		System.out.println(Base.Foo);
		System.out.println(Sub.Foo);
		
		System.out.println(b.Foo);
		System.out.println(s.Foo);
		
		System.out.println(((Base)s).Foo);
	}
}
