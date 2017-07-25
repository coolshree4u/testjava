package com.test;

public class Publicenum1 {
	public enum Flavors {
		VANILLS, CHOCOLATE, STRAWBERRY
	}

	public static void main(String[] args) {
		// TODO code application logic here
		System.out.println(Flavors.CHOCOLATE.ordinal());
		System.out.println(Flavors.VANILLS.ordinal());
		System.out.println(Flavors.STRAWBERRY.ordinal());
	}
}