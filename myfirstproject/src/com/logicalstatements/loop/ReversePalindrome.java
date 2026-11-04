package com.logicalstatements.loop;

import java.util.Scanner;

public class ReversePalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number");
		int a = sc.nextInt();

		int result = a;
		int reverse = 0;

		while (a > 0) {
			int b = a % 10;
			reverse = reverse * 10 + b;
			a = a / 10;
		}
		System.out.println("reverse number:" + reverse);

		if (result == reverse) {
			System.out.println("palindrome number");
		} else {
			System.out.println("not palindrome number");
		}

	}

}
