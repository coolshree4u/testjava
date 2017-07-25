package com.tution;

import java.text.NumberFormat;

public class Np1 {

	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getInstance();

		try {
			String one = "456abc";
			String two = "-2.5165e10";
			String three = "x85.3";

			System.out.println(nf.parse(one));
			System.out.println(nf.parse(two));
			System.out.println(nf.parse(three));
		} catch (Exception e) {
			System.out.println("No can not be parsed.....");
		}
	}

}