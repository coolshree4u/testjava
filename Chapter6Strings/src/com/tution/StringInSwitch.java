package com.tution;

public class StringInSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int noPlayer=6;
		String sport="Cricket";
		
		switch(sport){
		case "tennise":
			noPlayer=2;
			break;
		case "Cricket":
			noPlayer=11;
			break;
		case "baseball":
			noPlayer=9;
			break;
		}
		
		System.out.println(noPlayer+" players are needed");
	}

}
