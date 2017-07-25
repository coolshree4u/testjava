package com.tution;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class VectorCopyOnWriteArray {

	public static void main(String[] args) {

		CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<String>();
		list.add("Vivek");
		list.add("Kumar");
		
		Iterator i=list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			list.add("Abhishek");
		}
		System.out.println(list);
		
		System.out.println("After Modification");
		Iterator i2=list.iterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}
	}

}
