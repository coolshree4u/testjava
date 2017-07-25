package com.test;

import java.util.ArrayList;

public class PepproniPizza extends Pizza {

	ArrayList toppings;
	public void addTopping(String topping){
		toppings.add(topping);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza pizza=new PepproniPizza();
		pizza.addTopping("Mushrooms");
		
	}

}
