package com.tution;

import java.util.LinkedHashMap;

public class LMC1a {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> linkedHashMap=new LinkedHashMap<>();
		linkedHashMap.put(11, "Alice");
		linkedHashMap.put(15, "Tom");
		linkedHashMap.put(14, "Bob");
		
		System.out.println(linkedHashMap);
	}

}
