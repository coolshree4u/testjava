package com.test;

public class WareHouse {
	public static void main(String[] args) {
		Product p1 = new Product(10);
		Product p2 = new Product(10);
		Product p3 = new Product(20);
		System.out.println(p1.equals(p2) + " ");
		System.out.println(p1.equals(p3));

	}
}
