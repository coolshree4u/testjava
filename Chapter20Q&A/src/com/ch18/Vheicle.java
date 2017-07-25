package com.ch18;

public class Vheicle {
	int distance;
	
	public Vheicle(int d) {
		distance=d;
	}
	
	public void incrSpeed(int time){
		int timeTravel=time;
		
		class Car{
			int value=0;
			
			public void speed(){
				value=distance/timeTravel;
				System.out.println("Velocity with new Speed "+value+" kmph");
			}
		}
		
		new Car().speed();
	}
	
	
	public static void main(String args[]){
		Vheicle v=new Vheicle(120);
		v.incrSpeed(60);
	}
}
