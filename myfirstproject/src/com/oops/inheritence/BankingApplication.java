package com.oops.inheritence;

class BankAccount {
	int accnum;
	String accholder;
	double blnc;

	void deposit(double amount) {
		blnc = blnc + amount;
	}

	void withdraw(double amount) {
		blnc = blnc - amount;

	}

	void displayBalance() {
		System.out.println("account number:" + accnum);
		System.out.println("account hodler name:" + accholder);
		System.out.println("balnace:" + blnc);
	}

}

class SavingsAccount extends BankAccount {
	@Override
	void deposit(double amount) {
		double total = blnc + amount;
		super.deposit(amount);
		System.out.println("****************");
		System.out.println(total);
	}
}

class CurrentAccount extends BankAccount {
	@Override
	void withdraw(double amount) {

		if (blnc - amount >= 1000) {
			super.withdraw(amount);
			System.out.println("withdraw successfully");
		} else {
			System.out.println("you must need to maintain 1000rs");
		}
		System.out.println("*******************");
	}
}

public class BankingApplication {

	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount();
		s.accnum = 1234567894;
		s.accholder = "trisha";
		s.blnc = 30000;

		s.deposit(1000.00);
		s.displayBalance();

		CurrentAccount c = new CurrentAccount();
		c.accholder = "bunny";
		c.accnum = 345689765;
		c.blnc = 300000;

		c.withdraw(5000);
		c.displayBalance();

	}

}
