package com.logicalstatements;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();

		if (marks > 100) {
			System.out.println("invalid");
		}
		if (marks >= 90) {
			System.out.println("A Grade");
		} else if (marks >= 80) {
			System.out.println("B Grade");
		} else if (marks >= 70) {
			System.out.println("c Grade");
		} else if (marks >= 60) {
			System.out.println("D Grade");
		} else {
			System.out.println("fail");
		}

	}

}
