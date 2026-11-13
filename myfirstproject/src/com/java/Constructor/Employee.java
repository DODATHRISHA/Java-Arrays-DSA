package com.java.Constructor;

public class Employee {

	int eid;
	String name;
	double sal;

	Employee() {
		System.out.println("no arg constructor started");
		eid = 101;
		name = "trisha";
		sal = 1000000.0;

		System.out.println("no arg constructor ended");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Employee e1 = new Employee();
		e1.empInfo();

		Employee e2 = new Employee();
		e2.eid = 102;
		e2.name = "bunny";
		e2.sal = 2000000.0;
		e2.empInfo();

		Employee e3 = new Employee();
		e3.eid = 103;
		e3.name = "nani";
		e3.empInfo();

		System.out.println("main method ended");

	}

	void empInfo() {
		System.out.println("******************");
		System.out.println("Empoyee id:" + eid);
		System.out.println("Empoyee name:" + name);
		System.out.println("Empoyee  sal:" + sal);
	}

}
