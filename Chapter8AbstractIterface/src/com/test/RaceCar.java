package com.test;

public class RaceCar extends Vehicle {
	
	public int speed(){
		return 150;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RaceCar raceCar=new RaceCar();
		Car car=new Car();
		Vehicle vehicle1=new Vehicle() {
		};
		Vehicle vehicle=new RaceCar();
		System.out.println(raceCar.speed()+","+car.speed()+","+vehicle.speed());
	}

}
