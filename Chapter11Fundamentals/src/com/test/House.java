package com.test;

public class House {
	public String address;

	public void finalize() {
		System.out.println("inside house");
		address = null;
	}
}
