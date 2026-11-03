package com.logicalstatements.loop;

import java.util.Scanner;

public class CheckNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		for (int i = 1; i <= 20; i++) {
			System.out.print(i + " ");
		}

		int a = sc.nextInt();
		System.out.println("even numbers");
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println("sum number");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				sum = sum + i;
			}
		}

		System.out.println("Sum = " + sum);

	}
}
