package com.test;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test9 {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> cowList=new CopyOnWriteArrayList<>();
		cowList.add(4);
		cowList.add(2);
		cowList.add(6);
		Iterator<Integer> it=cowList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next()+" ");
			cowList.add(2);
		}
		
		for(Integer i:cowList){
			System.out.print(i+" ");
		}
	}

}
