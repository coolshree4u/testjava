package com.tution;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapTestConcurrent {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> map=new ConcurrentHashMap<Integer,String>();
		map.put(10, "Vivek");
		map.put(20,"Kumar");
		
		Set<Integer> set=map.keySet();
		for (Integer integer : set) {
			System.out.println(integer+"  "+map.get(integer));
			map.put(30, "Abhishek");
		}
		
		System.out.println("After Modification");
		for (Integer integer : set) {
			System.out.println(integer+"  "+map.get(integer));
		}
	}

}
