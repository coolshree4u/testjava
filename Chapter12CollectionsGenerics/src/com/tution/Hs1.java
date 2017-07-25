package com.tution;

import java.util.HashSet;

public class Hs1 {

	public static void main(String[] args) {
		HashSet<String> carData=new HashSet<>();
		carData.add("Santro");
		carData.add("Estem");
		carData.add("Accent");
		carData.add("Polo");
		carData.add("Xylo");
		carData.add("Accent");
		carData.add("Nano");
		
		System.out.println(carData.size());
		System.out.println(carData);
		
		carData.remove("Accent");
		carData.remove("XUV");
		
		System.out.println(carData);
		System.out.println();
		
		carData.clear();
		System.out.println(carData.isEmpty());
		System.out.println(carData);
	}

}
