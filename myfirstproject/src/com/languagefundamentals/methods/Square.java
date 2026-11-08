package com.languagefundamentals.methods;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		
		Square s = new Square();
		int result = s.square(a);
		System.out.println(result);

	}
	int square(int a) {
		int num = a*a;
		 return num;
		
	}

}
