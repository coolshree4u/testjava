package com.test;

import java.util.ArrayList;
import java.util.Collections;

public class Test11 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		
		Collections.sort(a);
		a.add(2);
		Collections.reverse(a);
		System.out.println(a);
	}

}
