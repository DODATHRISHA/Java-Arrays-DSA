package com.oops.inheritence;

class Grandfather {

	void house() {
		System.out.println("beautifull");
	}
}

class Father extends Grandfather {

	void car() {
		System.out.println("red colour car");
	}
}

class Son extends Father {
	void bike() {
		System.out.println("bike");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Son s = new Son();
		s.house();
		s.car();
		s.bike();

	}

}
