package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test13 {
	public static Iterator reverse(List lst){
		Collections.reverse(lst);
		return lst.iterator();
	}
	
	public static void main(String[] args) {
		List list=new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		
		Iterator i=reverse(list);
		while (i.hasNext()) {
			Object object = (Object) i.next();
			System.out.println(object);
		}
	}

}
