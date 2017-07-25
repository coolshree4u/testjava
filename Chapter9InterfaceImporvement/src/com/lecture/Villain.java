package com.lecture;

public class Villain implements Actor4 {

	@Override
	public void act() {
		System.out.println("I can act");
	}

	@Override
	public void speak() {
		System.out.println("I can speak Hindi and Marathi");
	}
	
	public static void main(String args[])
	{
		Villain villain = new Villain();
		villain.comedy();
		
		//normal reference
		Hero hero=new Hero();
		hero.comedy();
		
		//polymorphic reference
		Actor4 actor=new Villain();
		actor.comedy();
	}
}