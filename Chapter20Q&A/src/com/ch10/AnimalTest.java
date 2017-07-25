package com.ch10;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal=new Dog();
		System.out.println(animal.noise());
		Cat cat=(Cat) animal;
		System.out.println(cat.noise());
		//Casting error will be there
	}

}
