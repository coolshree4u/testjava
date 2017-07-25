package com.test;

public interface Herbivore {
	int amount=10;
	public static void eatGrass(){}
	public default int chew(){
		return 13;
	}
}
