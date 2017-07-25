package com.tution;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorTest1 {

	public static void main(String[] args) {
		List<String> list=new Vector<String>();
		list.add("Vivek");
		list.add("Kumar");
		
		Iterator i=list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			list.add("Abhishek");
		}
	}

}
