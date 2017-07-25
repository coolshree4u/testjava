package com.test;

public class SailBoat extends Boat {

	String doFloat(){
		return "slow float";
	}
	@Override
	void doDock() {
		
	}
	public static void main(String args[]){
		Boat b=new SailBoat();
		
		Boat b2=new Boat() {
			
			@Override
			void doDock() {
				// TODO Auto-generated method stub
				System.out.println("Inside Boat Object");
			}
		};
		
		b2.doDock();
	}
}
