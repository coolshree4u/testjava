package com.ch5;

import java.io.Console;

public class Test2 {

	public static void main(String[] args) {
		Console c = null;
		char[] pw=c.readPassword("%s", "pw: ");
		System.out.println("got"+pw);
		
		String name=c.readLine("%s","name: ");
		//System.out.println("got",name);
		
	}

}
