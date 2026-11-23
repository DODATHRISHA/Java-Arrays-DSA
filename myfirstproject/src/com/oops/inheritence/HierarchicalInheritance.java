package com.oops.inheritence;

class Employee1{
	String name;
	int salary;

	void display() {
		System.out.println(name);
		System.out.println(salary);
	}
}

class Developer extends Employee1 {

}

class Tester extends Employee1 {

}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Tester t = new Tester();
		t.name = "trisha";
		t.salary = 1000000;

		t.display();

	}

}
