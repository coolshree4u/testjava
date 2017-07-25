package com.tution;

import java.util.ArrayList;
import java.util.Collections;

public class ALE1bc {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<>();
		arrayList.add("Java");
		arrayList.add("C++");
		arrayList.add("Oracle");
		arrayList.add("C");
		arrayList.add("Ajax");
		Collections.sort(arrayList);
		for (String a : arrayList) {
			System.out.print(a+"\t");
		}
		System.out.println();
		
		System.out.println("Java is present at "+Collections.binarySearch(arrayList, "Java"));
		
		arrayList.add("Android");
		Collections.reverse(arrayList);
		for (String a : arrayList) {
			System.out.print(a);
		}
	}

}
