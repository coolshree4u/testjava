package com.tution;

enum Meal {
	BREAKFAST(7, 30), LUNCH(12, 30), DINNER(8, 30);
	private int hours;
	private int mins;

	Meal(int h, int m) {
		hours = h;
		mins = m;
	}

	public int getH() {
		return hours;
	}

	public int getM() {
		return mins;
	}

}

public class MealTest {

	public static void main(String[] args) {
		Meal m1 = Meal.DINNER;
		System.out.println(m1.name() + " will be served at " + m1.getH() + " hours " + m1.getM() + " mins ");
		for (Meal m : Meal.values()) {
			System.out.println(m1.name() + " will be served at " + m1.getH() + " hours " + m1.getM() + " mins ");
		}

	}
}
