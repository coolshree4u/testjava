package com.lecture;

public class Cart implements Walk, Run {

	@Override
	public int getSpeed() {
		return 1;
	}

	public static void main(String args[]) {
		System.out.println(new Cart().getSpeed());
	}
}