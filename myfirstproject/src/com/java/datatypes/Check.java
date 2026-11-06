package com.java.datatypes;

import java.util.Scanner;

public class Check {

	byte stno = 1;
	String name = "trisha";
	short code = 1234;
	int phnnum = 12345678;
	long num = 1234567896543123677L;

	static int a = 10;
	static int b = 20;
	static int result = a + b;

	// average formula :- total/count
	static double c = 10.9;
	static double c1 = 20.9;
	static double c2 = 30.9;
	static double c3 = 40.9;
	static double c4 = 50.9;
	static double total = c + c1 + c2 + c3 + c4;
	static double average = total / 5;
	
	//ASCII/Unicode value
	char ch = 'A';
	int value = ch;
	
//	area of circle
	static double length = 12.0;
	static double breadth = 34.0;
	static double area = length*breadth;
	
//	Type Conversion
	int m = 1;
	double n = m;
	
	double e = 5;//need type casting
	int r = (int) e;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Check c = new Check();
		System.out.println("student no:" + c.stno);
		System.out.println("student name:" + c.name);
		System.out.println("student code:" + c.code);
		System.out.println("student phnnum:" + c.phnnum);
		System.out.println("student num:" + c.num);
		//add
		System.out.println("total num:" + result);
		// average formula
		System.out.println("average:" + average);
		//ASCII/Unicode value
		System.out.println("value:"+c.value);
//		area of circle
		System.out.println("area:"+area);
//		Type Conversion
		System.out.println("Type Conversion:"+c.n);
		System.out.println("Type Conversion:"+c.r);

	}

}
