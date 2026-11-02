package com.logicalstatements.loop;

import java.util.Scanner;

//input:- 5-->5!
//output:-5*4*3*2*1*=120
public class Factorial {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int fact = 1;

		for (int i = n; i >= 1; i--) {
			fact = fact * i;
		}

		System.out.println("factorial of a given number is :" + fact);
	}

}
