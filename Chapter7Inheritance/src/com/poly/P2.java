package com.poly;

public class P2 extends P1 {

	public P2() {
		super();
		System.out.println("P2");
	}
	public P2(int d){
		//super(); this or super must be the first line in the constructor
		//this();
		super(d);
		System.out.println("PC P2");
	}
}
