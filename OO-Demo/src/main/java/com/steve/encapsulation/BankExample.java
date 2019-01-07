package com.steve.encapsulation;

public class BankExample {

	public static void main(String[] args) {
		Account a = new Account();
		a.balance = 23495892;
		a.updateBalance();
	}

}

class Account{
	int balance = 123;
	public void updateBalance(String uid, int newBalance) {
		System.out.println("Updating balance - logging to audit table with newBalance and User that made the change");
	}
	public void updateBalance() {
		// Maybe some database insert or update goes here?
	}
}

