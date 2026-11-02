package com.logicalstatements.loop;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();

		factoralInfo(n);

	}

	static void factoralInfo(int n) {

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
	}

}
