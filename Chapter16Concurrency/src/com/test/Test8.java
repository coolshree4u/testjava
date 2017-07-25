package com.test;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test8 extends Thread {

	static List<Integer> myList = new CopyOnWriteArrayList<>();

	public static void main(String[] args) {
		myList.add(11);
		myList.add(22);
		myList.add(33);
		myList.add(44);
		new Test8().start();

		for (Integer i : myList) {
			System.out.println(i);
		}

	}

	public void run() {
		myList.add(55);
		myList.add(66);
	}

}
