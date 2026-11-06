package com.logicalstatements.loop;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number");
		int a = sc.nextInt();

		int sum = 0;

		while (a > 0) {

			int rem = a % 10;
			sum = sum + rem;
			a = a / 10;
		}

		while (sum > 9) {

			int temp = sum;
			sum = 0;

			while (temp > 0) {
				int rem = temp % 10;
				sum = sum + rem;
				temp = temp / 10;
			}
		}

		if (sum == 1) {
			System.out.println("it is a magic number");
		} else {
			System.out.println("it is not a magic number");
		}
	}
}
