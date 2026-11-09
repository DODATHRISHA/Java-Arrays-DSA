package com.accessmodifier01;

public class Employee {
	private String a = "Welcome to Java";

	private Employee(int id) {
		System.out.println(id);
	}

	private Employee(String name, int numberphn) {
		System.out.println(name);
	}

	private Employee(String city, int houseno, int pincode) {
		System.out.println(city + " " + houseno + " " + pincode);
	}

	public static void main(String[] args) {
		Employee e = new Employee(101);
		e.show();
		Employee e1 = new Employee("trisha", 123456788);
		Employee e3 = new Employee("city", 12, 20076);

	}

	private void show() {
		System.out.println(a);
	}

}
