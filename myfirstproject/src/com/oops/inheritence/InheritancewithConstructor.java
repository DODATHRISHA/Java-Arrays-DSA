package com.oops.inheritence;

class Person {
	  Person() {
		System.out.println("Parent Constructor");
	}
}

class Student1 extends Person {
	 Student1() {
		System.out.println("Child Constructor");
	}
}

public class InheritancewithConstructor {

	public static void main(String[] args) {
		Student1 s = new Student1();

	}

}
