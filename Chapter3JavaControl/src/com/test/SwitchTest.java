package com.test;

public class SwitchTest {

	public static void main(String[] args) {

		System.out.println("Value = "+switchIt(4));
	}

	private static int switchIt(int x) {
		int j=1;
		switch(x){
		case 1: j++;
		case 2: j++;
		case 3: j++;
		case 4: j++;
		case 5: j++;
		default: j++;
		}
		return j+x;
	}

	
}