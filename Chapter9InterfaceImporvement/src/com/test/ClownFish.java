package com.test;

public class ClownFish implements Aquatic {
	public int getNumberOfGrills(int input) {
		return input;
	}

	public static void main(String args[]) {
		System.out.println(new ClownFish().getNumberOfGrills(3));
	}
}
