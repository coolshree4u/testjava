package com.tution;

public class BookHash {
	int isbn;
	String title;

	public BookHash() {
		super();
	}

	public BookHash(int isbn, String title) {
		super();
		this.isbn = isbn;
		this.title = title;
	}

	public String toString() {
		return this.isbn + "   " + this.title;
	}

	public boolean equals(Object o) {
		BookHash bh = (BookHash) o;
		return this.isbn == bh.isbn;
	}

	public int hashcode() {
		return isbn;
	}
}
