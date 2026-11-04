package com.logicalstatements.loop;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		System.out.println("numbers");
		while (a <= 10) {
			System.out.println(a);
			a++;
		}

		System.out.println("reverse");
		int b = sc.nextInt();
		while (b >= 1) {
			System.out.println(b);
			--b;
		}

		System.out.println("even numbers");
		int c = sc.nextInt();
		while (c > 0) {
			if (c % 2 == 0) {
				System.out.println(c);
			}
			c--;
		}

		System.out.println("enter a odd number");
		int d = sc.nextInt();
		while (d > 0) {
			if (d % 2 != 0) {
				System.out.println(d);
			}
			d--;
		}

		System.out.println("enter a table number");
		int e = sc.nextInt();
		int i = 1;
		while (i <= 10) {
			System.out.println(i + "*" + i + "=" + (e * i));
			i++;
		}

		System.out.println("enter a number");

		int f = sc.nextInt();
		int sum = 0;

		while (f > 0) {
			sum = sum + f;
			f--;
		}
		System.out.println(sum);

		System.out.println("enter a number for counting");
		int g = sc.nextInt();
		int count = 0;

		while (g > 0) {
			count++;
			g--;
		}
		System.out.println(count);

		int n = sc.nextInt();
		int j = 1;
		while (j <= n) {
		    System.out.println(j);
		    j++;
		}

	}

}
