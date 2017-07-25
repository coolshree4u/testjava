package com.tution;

public class GarbageTruck {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("hello");
		StringBuffer s2 = new StringBuffer("goodbye");
		System.out.println(s1);
		s1 = s2;
	}
}
