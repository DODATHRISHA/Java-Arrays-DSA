package com.Array;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a;
		System.out.println("enter a numbers");
		a = new int[4];
		int search = 3;

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if (a[i] == search) {
				System.out.println("element found");
			}
			if (a[i] != search) {
				System.out.println("element not found");
			}
		}
	}

}
