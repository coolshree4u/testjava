package com.tution;

import java.util.HashMap;

public class MC1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hashMap=new HashMap<>();
		hashMap.put(15, "John");
		hashMap.put(11, "Alice");
		hashMap.put(15, "Tom");
		hashMap.put(14, "Bob");
		hashMap.putIfAbsent(15, "Jim");
		
		System.out.println(hashMap);
		System.out.println(hashMap.containsKey(15));
		System.out.println(hashMap.containsValue("Alice"));
		System.out.println(hashMap.get(11));
		System.out.println(hashMap.get(16));
		
		hashMap.remove(15,"KK");
		System.out.println(hashMap);
		
		hashMap.remove(15);
		System.out.println(hashMap);
		
	}

}
