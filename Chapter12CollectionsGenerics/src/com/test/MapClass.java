package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapClass {

	public static void main(String[] args) {
		Map<String, String> partList=new HashMap<>();
		partList.put("p002","LargeWidget");
		partList.put("p001","Widget");
		partList.put("p002","X-Large Widget");
		
		Set<String> keys=partList.keySet();
		for (String string : keys) {
			System.out.println(string+" "+partList.get(string));
		}
	}
}