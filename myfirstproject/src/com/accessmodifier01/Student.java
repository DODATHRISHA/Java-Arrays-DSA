package com.accessmodifier01;

//Illegal modifier for the class Student; only public, abstract & final are permitted
final class Student {
	private int id = 101;
	private String name = "trisha";
	private String clgname = "CMR";
	private char Grade = 'A';

	public static void main(String[] args) {
		Student s = new Student();
		s.display();
		System.out.println(s.display1());
		s.display2();
		s.display3();

	}

	private void display() {
		System.out.println(id);
	}

	private String display1() {
		return name;
	}

	private void display2() {
		System.out.println(clgname);
	}

	private void display3() {
		System.out.println(Grade);
	}

}
