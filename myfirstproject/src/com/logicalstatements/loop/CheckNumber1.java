package com.logicalstatements.loop;

import java.util.Scanner;

public class CheckNumber1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number");
		int a = 100;
		int sum = 0;
		while (a > 0) {
			if (a % 2 == 0) {
				sum = sum + a;
			}
			a--;
		}
		System.out.println(sum);

		System.out.println("enter a odd number");
		int b = 100;
		int sum1 = 0;
		while (b > 0) {
			if (b % 2 != 0) {
				sum1 = sum1 + b;
			}
			b--;
		}
		System.out.println(sum1);

		System.out.println("enter factorial");
		int c = sc.nextInt();
		int fact = 1;
		while (c > 0) {
			fact = fact * c;
			c--;
		}
		System.out.println(fact);

		System.out.println("enter a number");
		int d = sc.nextInt();
		int reverse = 0;
		while (d > 0) {
			int num = d % 10;
			reverse = reverse * 10 + num;
			d = d / 10;
		}
		System.out.println(reverse);

		System.out.println("enter count number");
		int e = sc.nextInt();
		int count = 0;
		while (e > 0) {
			count++;
			e--;
		}
		System.out.println(count);

		System.out.println("enter sum number");
		int f = sc.nextInt();
		int sum2 = 0;
		while (f > 0) {
			sum2 = sum2 + f;
			f--;
		}
		System.out.println(sum2);

		System.out.println("enter a palindrome number");

		int g = sc.nextInt();
		int result = g;
		int reverse1 = 0;

		while (g > 0) {
			int num1 = g % 10;
			reverse1 = reverse1 * 10 + num1;
			g = g / 10;
		}

		System.out.println("reverse number: " + reverse1);

		if (result == reverse1) {
			System.out.println("it is palindrome");
		} else {
			System.out.println("it is not a palindrome");
		}
	}

}
