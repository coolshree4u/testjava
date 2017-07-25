package com.test;

import java.util.HashSet;

public class Wrapped {
	private String s;
	
	
	public Wrapped(String s) {
		super();
		this.s = s;
	}


	public static void main(String args[]){
		HashSet<Object> hs=new HashSet<>();
		Wrapped ws1=new Wrapped("aardvark");
		Wrapped ws2=new Wrapped("aardvark");
		
		String s1=new String("aardvark");
		String s2=new String("aardvark");
		
		hs.add(ws1);
		hs.add(ws2);
		hs.add(s1);
		hs.add(s2);
		
		System.out.println(hs.size());
	}
}
