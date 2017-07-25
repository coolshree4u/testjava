package com.tution;

public class Th {

	public static void main(String[] args) {
		Thread th=Thread.currentThread();
		System.out.println("Current Thread"+th);
		System.out.println("Thread Name "+th.getName());
		System.out.println("Thread Id "+th.getId());
		System.out.println("Thread Priority "+th.getPriority());
	}
}