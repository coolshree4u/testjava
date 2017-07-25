package com.test;

public class SampleClass {
	public static void main(String[] args) {
		AnotherSampleClass asc = new AnotherSampleClass();
		SampleClass sc = new SampleClass();
		System.out.println("sc:" + sc.getClass());
		System.out.println("asc:" + asc.getClass());

	}
}
