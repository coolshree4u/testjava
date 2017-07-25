package com.test;

import java.util.ArrayList;
import java.util.Collections;

public class NameTest {

	public static void main(String[] args) {
		ArrayList<Name> list = new ArrayList<Name>();
		list.add(new Name("Joe", "Shmoe"));
		list.add(new Name("John", "Doe"));
		list.add(new Name("Jane", "Doe"));
		Collections.sort(list);
		for (Name n : list) {
			System.out.println(n);
		}
	}

}
