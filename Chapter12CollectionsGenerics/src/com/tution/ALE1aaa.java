package com.tution;

import java.util.ArrayList;
import java.util.Collections;

public class ALE1aaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("Java");
		al.add("C++");
		al.add("Java");
		al.add("Oracle");
		//al.add(123);
		//java.lang.ClassCastException: java.lang.String cannot be cast to Integer
		al.add("C");
		al.add("AJAX");
		System.out.println("Contents of ArrayList "+al);
		Collections.sort(al);
		System.out.println("Contents of ArrayList By Sorted"+al);
	}

}
