package com.test;

import java.util.TreeSet;

public class Explorer2 {

	public static void main(String[] args) {
		TreeSet<Integer> s = new TreeSet<>();
		TreeSet<Integer> sub = new TreeSet<>();

		for (int i = 606; i < 613; i++)
			if (i % 2 == 0)
				s.add(i);
		sub = (TreeSet<Integer>) s.subSet(608, true, 611, true);
		s.add(629);
		System.out.println(s + " " + sub);
	}

}
