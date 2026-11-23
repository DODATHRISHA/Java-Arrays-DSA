package com.oops.inheritence;

class Animal {
	void eat() {
		System.out.println("Animals are eating");
	}

}

class Dog extends Animal {
	void bark() {
		System.out.println("Dog is barking");
	}

}

public class SingleInheritance {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.bark();

	}

}
