package com.tution;

public class Exception2Demo {

	public static void main(String[] args) {

		System.out.println("No. is entered.....");
		try{
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		
		int result=n1/n2;
		
		System.out.println("Result is "+result);
		}catch (NumberFormatException ne) {
			System.out.println("Inside NumberFormatException");
		}catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Inside ArrayIndexOutofBoundException");
		}catch (ArithmeticException ae) {
			System.out.println("Inside ArithmeticException");
		}catch (Exception e) {
			System.out.println("Inside Super Class Execption");
		}
	}
}