package com.test;

public class Name implements Comparable<Name> {
	String first, last;

	public Name(String first, String last) {
		this.first = first;
		this.last = last;

	}

	public int compareTo(Name n) {
		int cmpLast = last.compareTo(n.last);
		return cmpLast != 0 ? cmpLast : first.compareTo(n.first);
	}

	public String toString() {
		return first + " " + last;
	}

}