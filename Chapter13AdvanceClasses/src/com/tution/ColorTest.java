package com.tution;

enum Colors {
	Red, Green, Blue
}

class ColorTest {

	public static void main(String[] args) {
		Colors c1 = Colors.Red;
		switch (c1) {
		case Red:
			System.out.println("Ur choice is RED");
			break;

		/*case 1:
			System.out.println("Ur choice is Green");
			break;*/

		//case Colors.Blue:
		case Blue:
			System.out.println("Ur choice is Blue");
			break;

		//case GREEN:
		case Green:
			System.out.println("Ur choice is GREEN");
			break;
		}
	}

}
