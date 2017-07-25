package com.test;

public class Donkey {
	public static void main(String args[]){
		boolean assertOn=false;
		assert(assertOn): assertOn =true;
		if(assertOn)
			System.out.println("Assert is on");
	}
}