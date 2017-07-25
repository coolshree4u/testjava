package com.tution;

import java.util.ArrayList;
import java.util.Iterator;

public class L1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(3);
		list.add(3);
		System.out.println(list);
		list.add(0,8);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
		list.set(1, 7);
		for (Integer integer : list) {
			System.out.print(integer+" ");
		}
		list.remove(3);
		Iterator i=list.iterator();
		while (i.hasNext()) {
			System.out.print(i.next()+" ");
		}

		list.remove(new Integer(3));
		System.out.println(list);
		
		System.out.println(list.contains(8));
		System.out.println(list.contains(new Integer(8)));
		
	}

}
