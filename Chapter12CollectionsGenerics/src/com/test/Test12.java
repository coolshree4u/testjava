package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test12 {

	public static void main(String[] args) {
		Collection<Integer> myItems=new ArrayList<>();
		myItems.add(9);
		myItems.add(1);
		myItems.add(1);
		
		Iterator<Integer> iterator=myItems.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
			
		}
	}

}
