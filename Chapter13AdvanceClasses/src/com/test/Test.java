package com.test;

public class Test {
	public enum Dogs {
		collie, harrier
	};

	public static void main(String[] args) {
		// TODO code application logic here
		Dogs myDog = Dogs.collie;
		switch (myDog) {
		case collie:
			System.out.print("collie");
		case harrier:
			System.out.print("harrier");
		}
	}
}
