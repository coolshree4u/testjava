package com.tution;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class HashSetTestConcurrent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<String>();
		set.add("Vivek");
		set.add("Kumar");

		Iterator i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			set.add("Abhishek");
		}
		System.out.println("After Modification ******************************************");
		Iterator i2 = set.iterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}
	}

}
