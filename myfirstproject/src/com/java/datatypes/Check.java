package com.java.datatypes;

import java.util.Scanner;

public class Check {

	byte stno = 1;
	String name = "trisha";
	short code = 1234;
	int phnnum = 12345678;
	long num = 1234567896543123677L;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Check c = new Check();
		System.out.println("student no:" + c.stno);
		System.out.println("student name:" + c.name);
		System.out.println("student code:" + c.code);
		System.out.println("student phnnum:" + c.phnnum);
		System.out.println("student num:" + c.num);

	}

}
