package com.logicalstatements.loop;

import java.util.Scanner;

//what is perfect number = sum of it's factors excluding itsef.
//WAP to find whether the given number is perfect or not..?
//example:- number is 6-->1 +2+3=6

public class NumberCheck {
	static boolean isperfect(int n) {
		boolean status = false;
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
			if (sum == n) {
				status = true;
			}

		}

		return status;
	}

	public static void main(String[] args) {

		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();

		boolean status = isperfect(n);

		if (status) {
			System.out.println("The given number is perfect");
		} else {
			System.out.println("the given number is not perfect");
		}

		System.out.println("main method ended");

	}

}
