package com.tution;

public class WorkTest9b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		W1.WORK w1 = W1.WORK.EMPLOYEED;
		//W1.WORK w2 = WORK.EMPLOYEED;
		//W1.WORK w3 = new W1.WORK();
		W1.WORK w2 = W1.WORK.UNEMPLOYEED;
		W1.WORK w3 = W1.WORK.EMPLOYEED;
		if (w1.equals(w3)) {

			System.out.println("w1.equals(w3) "+w1.equals(w3));
		}
	}

}
