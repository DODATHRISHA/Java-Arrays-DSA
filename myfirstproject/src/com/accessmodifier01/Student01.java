package com.accessmodifier01;

public class Student01 {
	public int id = 1;
	public String name = "trisha";

	public Student01() {
		System.out.println("hello everyone");
	}

	public Student01(String name) {
		System.out.println(name);
	}

	public static void main(String[] args) {
		Student01 s = new Student01();
		s.display(12344);
		Student01 s1 = new Student01("trisha");
		s1.display1(123356789954L);

	}

	public void display(int num) {
		System.out.println(num);
	}

	public void display1(long accnum) {
		System.out.println(accnum);
	}

}
