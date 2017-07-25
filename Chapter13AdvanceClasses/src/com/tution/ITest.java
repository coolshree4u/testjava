package com.tution;

enum IceCream {
	PLAIN(2), SUGAR(3), WAFFLE(5);

	private IceCream(int scoops) {
		this.scoops = scoops;
	}

	public final int scoops;
}

class ITest {

	public static void main(String[] args) {
		IceCream cone1 = IceCream.SUGAR;
		System.out.println(cone1 + " would get " + cone1.scoops + " scoops ");
	}

}
