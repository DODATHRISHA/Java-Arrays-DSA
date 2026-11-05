package com.logicalstatements.loop;

import java.util.Scanner;

public class SKYnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a * a * a * a;
		int sum = 0;

		while (b > 0) {
			int num = b % 10;
			sum = sum + num;
			b = b / 10;
		}
		if (sum == b) {
			System.out.println("it is a SKY number");
		} else {
			System.out.println("it is not a SKY number");
		}

	}

}
