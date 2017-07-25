package com.test;

import java.util.ArrayList;
import java.util.List;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List lst=new ArrayList<>();
		lst.add("One");
		lst.add("Two");
		lst.add(7);
		
		for (Object object : lst) {
			
			System.out.println(object);
		}
		/*
		for (String str : lst) {
			System.out.println(str);
		}
		error while casting
		*/
	}

}
