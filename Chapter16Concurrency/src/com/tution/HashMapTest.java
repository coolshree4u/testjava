package com.tution;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(10, "Vivek");
		map.put(20,"Kumar");
		
		Set<Integer> set=map.keySet();
		for (Integer integer : set) {
			System.out.println(integer+"  "+map.get(integer));
			map.put(30, "Abhishek");
		}
	}

}
