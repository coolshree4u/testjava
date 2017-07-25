package com.test;

public class Owl implements Nocturnal {
	@Override
	public boolean isBlind() {
		// TODO Auto-generated method stub
		return false;
	}
	public static void main(String[] args){
		
		Nocturnal nocturnal=new Owl();
		System.out.println(nocturnal.isBlind());
	}
}