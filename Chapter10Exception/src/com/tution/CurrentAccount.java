package com.tution;

public class CurrentAccount {
	private double balence;
	private int number;

	public CurrentAccount(int number) {
		this.number = number;
	}

	public void deposite(double amount) {
		balence = balence + amount;
	}

	public void withdraw(double amount) throws InsufficientFundsException{
		if (amount <= balence) {
			balence = balence - amount;
		} else {
			double needs = amount - balence;
			throw new InsufficientFundsException(needs);
		}

	}

	public double getBalence() {
		return balence;
	}

	public int getNumber() {
		return number;
	}
}