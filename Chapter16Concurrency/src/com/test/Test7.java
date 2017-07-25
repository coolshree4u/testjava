package com.test;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test7 {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> cowList=new CopyOnWriteArrayList<>();
		cowList.add(4);
		cowList.add(2);
		Iterator<Integer> it=cowList.iterator();
		cowList.add(5);
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println(integer);
		}
		
	
		Iterator<Integer> itmodified=cowList.iterator();
		while (itmodified.hasNext()) {
			Integer integer = (Integer) itmodified.next();
			System.out.println(integer);
		}
	}

}
