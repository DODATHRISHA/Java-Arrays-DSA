package com.Array;

import java.util.Scanner;

public class Avarage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int[] a = new int[8];
		int sum = 0;
		int avarage = 0;

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		avarage = sum / a.length;
		System.out.println(avarage);
		System.out.println("total sum:"+sum);
	}
}
