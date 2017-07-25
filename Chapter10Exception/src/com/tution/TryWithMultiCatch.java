package com.tution;

public class TryWithMultiCatch {
	public static void main(String args[])
	{
		System.out.println("No. is entered.....");
		try{
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		
		int result=n1/n2;
		
		System.out.println("Result is "+result);
		}catch (NumberFormatException | ArrayIndexOutOfBoundsException | ArithmeticException ex) {
			System.out.println("Inside GenericException");
		}catch (Exception e) {
			System.out.println("Inside Other Exception");
		}
	}
}
