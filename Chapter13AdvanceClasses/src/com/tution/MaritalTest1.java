package com.tution;

public class MaritalTest1 {

	enum Marital {
		MARRIED, UNMARRIED
	}

	public static void main(String[] args) {
		Marital m1 = Marital.MARRIED;
		Marital m2 = Marital.MARRIED;
		if (m1 == m2) {
			System.out.println("m1==m2  "+(m1==m2));
		}
		if (m1.equals(m2)) {
			System.out.println("m1.equals(m2)  "+m1.equals(m2));
		}

	}
}
