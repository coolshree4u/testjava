package com.test;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out=new Outer();
		Outer.Inner in=out.new Inner();
		in.go();
	}
}