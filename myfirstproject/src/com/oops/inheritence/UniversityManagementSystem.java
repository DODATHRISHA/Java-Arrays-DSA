package com.oops.inheritence;

class Person1 {
	String name;
	int age;
	String address;

	Person1(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	void Display() {
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("address:" + address);
	}

}

class Student2 extends Person1 {
	int rollNumber;
	String course;

	Student2(String name, int age, String address, int rollNumber, String course) {
		super(name, age, address);
		this.rollNumber = rollNumber;
		this.course = course;
	}

	void display() {
		super.Display();
		System.out.println("****************************");
		System.out.println("rollNumber:" + rollNumber);
		System.out.println("course:" + course);
	}
}

class Professor extends Person1 {
	int employeeId;
	String subject;

	Professor(String name, int age, String address, int employeeId, String subject) {
		super(name, age, address);
		this.employeeId = employeeId;
		this.subject = subject;
	}

	void display() {
		super.Display();
		System.out.println("*********************");
		System.out.println("employeeId:" + employeeId);
		System.out.println("subject:" + subject);
	}
}

class ResearchScholar extends Student2 {

	String Course;
	String ResearchTopic;

	ResearchScholar(String name, int age, String address, int rollNumber, String course, String researchTopic) {
		super(name, age, address, rollNumber, course);
		this.ResearchTopic = researchTopic;

	}

	@Override
	void display() {
		super.display();
		System.out.println("*****************************");
		System.out.println("ResearchTopic:" + ResearchTopic);
	}
}

public class UniversityManagementSystem {

	public static void main(String[] args) {
		Person1 p = new Person1("thrisha", 21, "Hyderabad");
		p.Display();

		Student2 s = new Student2("thrisha", 21, "Hyderabad", 1, "Java");
		s.display();
		s.Display();

		Professor p1 = new Professor("thrisha", 21, "Hyderabad", 101, "chemistry");
		;
		p1.display();
		p1.Display();

		ResearchScholar r = new ResearchScholar("thrisha", 21, "Hyderabad", 1, "Java", "AI INTELIGENT");
		r.display();
		r.Display();
	
	}

}
