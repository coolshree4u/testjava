package com.test;

import java.util.Iterator;
import java.util.TreeSet;

public class DrinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drink one=new Drink();
		Drink two=new Drink();
		one.name="coffee";
		two.name="Tea";
		TreeSet set=new TreeSet();
		set.add(one);
		set.add(two);
		
		Iterator<Drink> it=set.iterator();
		while (it.hasNext()) {
			Drink drink = (Drink) it.next();
			System.out.println(drink.name);
		}
		
	}

}
