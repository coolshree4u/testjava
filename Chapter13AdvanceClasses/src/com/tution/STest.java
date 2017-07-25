package com.tution;

enum Season {
	SUMMER, WINTER, MONSOON
}

public class STest {

	public static void main(String[] args) {
		Season s1 = Season.SUMMER;
		switch (s1) {
		case SUMMER:
			System.out.println("Its hot now");
			break;
		case WINTER:
			System.out.println("Its cold now");
			break;
		case MONSOON:
			System.out.println("Its pleasant now");
			break;

		}
	}
}
