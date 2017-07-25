package com.test;

public class PrapogationTest {

	public static void test()
	{
		
		try{
			String s =null;
			System.out.println(s.toString());
		}/*catch (Exception e) {
			System.out.println("Inside Catch Exception");
		}*/
		finally {
			System.out.println("Inside Test Finally");
		}
	}
	public static void main(String[] args) {
		try{
			test();
		}catch (Exception e) {
			System.out.println("Inside Exception");
		}
	}

}
