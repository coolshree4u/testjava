package com.test;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String o="-";
		switch("FRED".toLowerCase().substring(1,4)){
		case "yellow":
			o+="y";
		case "red":
			o+="r";
		case "green":
			o+="g";
		}
		System.out.println(o);
	}

}
