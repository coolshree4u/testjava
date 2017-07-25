package com.test;

import java.util.Collection;
import java.util.LinkedList;

public class Test10 {

	public static Collection get(){
		Collection sorted=new LinkedList();
		sorted.add("B");
		sorted.add("C");
		sorted.add("A");
		return sorted;
		
	}
	public static void main(String[] args) {
		 for (Object o : get()) {
			System.out.println(o+",");
		}
	}

}
