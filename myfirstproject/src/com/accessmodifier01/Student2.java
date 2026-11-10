package com.accessmodifier01;

public class Student2 {
	protected int id = 1;

	protected Student2(String name) {
		System.out.println(name);
	}

	protected Student2(double sal, long accnum) {
		System.out.println(sal + accnum);
	}

	public static void main(String[] args) {
		Student2 s = new Student2("trisha");
		Student2 s1 = new Student2(100.0, 123456787L);
		System.out.println(s.id);

		s.display(234);
		s.display1(12345678, "hyd");
	}

	protected void display1(int phnnum, String vlg) {
		System.out.println(phnnum + vlg);
	}

	protected void display(int num) {
		System.out.println(num);

	}

}


