package com.oops.inheritence;

class Bank {
	void getInterest() {
		System.out.println("Bank interest is 5%");
	}
}

class SBI extends Bank {
	@Override
	void getInterest() {
		System.out.println("SBI interest is 7%");
	}
}

class ICICI extends Bank {
	@Override
	void getInterest() {
		System.out.println("ICICI interest is 8%");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		ICICI i = new ICICI();
		i.getInterest();
		SBI s = new SBI();
		s.getInterest();
		Bank b = new Bank();
		b.getInterest();

	}

}
