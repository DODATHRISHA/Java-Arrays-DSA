package com.oops.inheritence;

class Employee4 {
	int empid;
	String name;
	int sal;

	Employee4(int empid, String name, int sal) {
//this keyword use to accessing the current class object
		this.empid = empid;
		this.name = name;
		this.sal = sal;

	}

	void displayDetails() {
		System.out.println("employe id:" + empid);
		System.out.println("empoye name:" + name);
		System.out.println("employee sal:" + sal);
	}

	void calculateBonus() {
		System.out.println("bonus");
	}
}

//we use extends keyword because using parent properties in the child class
class Developer1 extends Employee4 {

	Developer1(int empid, String name, int sal) {
//super is use to accessing parent class object
		super(empid, name, sal);
	}

//we use override here because we want to same method+same parameter+different implementation
	@Override
	void displayDetails() {
		System.out.println("***********developer********");
		super.displayDetails();
	}

	void calculateBonus() {
		int total = sal * 10 / 100;
		int bonus = sal + total;
		System.out.println("total bonus:" + bonus);
	}

}

class Manager2 extends Employee4 {

	Manager2(int empid, String name, int sal) {
		super(empid, name, sal);
	}

	@Override
	void displayDetails() {
		System.out.println("*******manager*******");
		super.displayDetails();
	}

	void calculateBonus() {
		int total = sal * 20 / 100;
		int bonus = sal + total;
		System.out.println("total bonus:" + bonus);
	}
}

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		Developer1 d = new Developer1(1, "deveoper", 300000);
		d.displayDetails();
		d.calculateBonus();

		Manager2 m = new Manager2(2, "manager", 59000);
		m.displayDetails();
		m.calculateBonus();

	}

}
