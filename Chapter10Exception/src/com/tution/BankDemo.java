package com.tution;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentAccount c=new CurrentAccount(101);
		System.out.println("Depositing 500");
		c.deposite(500.00);
		
		try{
			System.out.println("Withdrawing 100");
			c.withdraw(100.00);
			System.out.println("Withdrawing 600");
			c.withdraw(600.00);
		}catch (InsufficientFundsException ie) {
			System.out.println("Sorry, but you are short "+ ie.getAmount());
		}
	}
}