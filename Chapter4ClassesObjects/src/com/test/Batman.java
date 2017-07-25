package com.test;

public class Batman {

	int squares=81;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Batman().go();
	}
	void go() {
		incr(++squares);
		System.out.println(squares);
	}
	void incr(int squares) {
		squares+=10;
	}

}
