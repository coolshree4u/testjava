package com.ch18;

public class Hard {
	private static int strict=1;
	
	class Harder extends Hard{
		private int strict=2;
		
		public void go(){
			System.out.println(strict);
			System.out.println(Hard.this.strict);
			System.out.println(super.strict);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Hard().new Harder().go();
	}

}