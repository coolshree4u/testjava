package com.test;

public class Barn {
	public static void main(String args[])
	{
		new Barn().go(10,"Kamal Class");
	}

	private void go(int i,String ...string) {
		for (String string2 : string) {
			System.out.println(string2);
		}
	}
}
