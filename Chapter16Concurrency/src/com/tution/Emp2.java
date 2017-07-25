package com.tution;

public class Emp2 {

	public static void main(String[] args) {
		Add2 home = new Add2();
		home.setStreet("M G Road");
		home.setCity("Mumbai");
		home.setPincode(400602);

		System.out.println(home.getStreet() + " " + home.getCity() + " " + home.getPincode());
	}

}
