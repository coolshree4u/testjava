package com.test;

public class Horse implements Animal {
	Long weight=1200L;
	@Override
	public void makeNoise() {
		System.out.println("whinny");
	}

}
