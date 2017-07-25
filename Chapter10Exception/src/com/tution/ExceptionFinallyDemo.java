package com.tution;

public class ExceptionFinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);

			int result = n1 / n2;

			System.out.println("Result is " + result);
		} catch (NumberFormatException | ArrayIndexOutOfBoundsException | ArithmeticException ex) {
			System.out.println("Inside Generic Exception");
		} catch (Exception e) {
			System.out.println("Inside Other Exception");
		}
		finally {
			System.out.println("Always Executed this block");
		}
	}

}
