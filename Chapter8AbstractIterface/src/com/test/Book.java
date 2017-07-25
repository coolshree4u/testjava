package com.test;

public abstract class Book {
	public abstract void read();

	public static void main(String args[]) {
		Book book = new NonFictionBook();
		book.read();
	}
}