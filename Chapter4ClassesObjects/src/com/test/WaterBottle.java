package com.test;

public class WaterBottle {
	private String brand;
	private boolean empty;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaterBottle wb =new WaterBottle();
		if(!wb.empty){
			System.out.println("Brand = "+ wb.brand);
		}
	}

}
