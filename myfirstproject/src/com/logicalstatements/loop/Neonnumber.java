package com.logicalstatements.loop;

import java.util.Scanner;

public class Neonnumber {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a * a;
		int sum = 0;

		while (b > 0) {
			int num = b % 10;
			sum = sum + num;
			b = b / 10;
		}
		if (sum == a) {
			System.out.println("it is a Neon number");
		} else {
			System.out.println("it is not a Neon number");
		}

	}

}
