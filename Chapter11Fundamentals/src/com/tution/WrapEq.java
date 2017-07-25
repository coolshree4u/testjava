package com.tution;

public class WrapEq {

	public static void main(String[] args) {
		Integer i = new Integer(-10);
		Integer j = new Integer(-10);
		Integer k = -10;
		System.out.println(i == j);
		System.out.println(i.equals(j));
		System.out.println(i == k);
		System.out.println(i.equals(k));

		Integer a = -10;
		Integer b = -10;
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a==k);
		System.out.println(a.equals(k));

		Integer p = 130;
		Integer q = 130;
		System.out.println(p==q);
		System.out.println(p.equals(q));
		System.out.println(p==k);
		System.out.println(p.equals(k));

		int m = 130;
		if (m == p) {
			System.out.println("equal");
		}

	}

}
