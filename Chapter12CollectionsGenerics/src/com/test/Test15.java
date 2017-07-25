package com.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set<Integer> set=new HashSet<>();
		Set<Integer> set=new LinkedHashSet<>();
		set.add(new Integer(3));
		set.add(new Integer(2));
		System.out.println(set);
	}

}
