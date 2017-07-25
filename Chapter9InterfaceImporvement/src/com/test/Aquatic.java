package com.test;

public interface Aquatic {
	public default int getNumberOfGrills(int input) {
		return 2;
	}
}
