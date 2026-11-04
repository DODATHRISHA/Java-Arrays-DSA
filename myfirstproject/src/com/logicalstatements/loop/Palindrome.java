package com.logicalstatements.loop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a word");
		String a = sc.next();

		String reverse = "";

		for (int i = a.length() - 1; i >= 0; i--) {
			reverse = reverse + a.charAt(i);
		}
		System.out.println("reverse word:" + reverse);

		if (a.equalsIgnoreCase(reverse)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not Palindrome");
		}

	}

}
