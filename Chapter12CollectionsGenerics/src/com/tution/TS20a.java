package com.tution;

import java.util.TreeSet;

public class TS20a {

	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<>();
		TreeSet<Integer> subSet=new TreeSet<>();
		set.add(10);
		set.add(30);
		set.add(20);
		set.add(50);
		set.add(40);
		
		subSet=(TreeSet<Integer>) set.subSet(20, false, 40, true);
		System.out.println(set+"  "+subSet);
		
		
		set.add(32);
		System.out.println(set+"  "+subSet);
		
		set.add(53);
		System.out.println(set+"  "+subSet);
		
		set.add(38);
		System.out.println(set+"  "+subSet);
		
		set.add(42);
		System.out.println(set+"  "+subSet);
	}

}
