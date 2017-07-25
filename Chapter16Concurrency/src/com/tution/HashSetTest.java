package com.tution;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		set.add("Vivek");
		set.add("Kumar");
		
		Iterator i=set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			set.add("Abhishek");
		}
	}

}
