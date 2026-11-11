package com.Array;

import java.util.Scanner;

public class SumNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a;
		System.out.println("enter a numbers");
		a = new int[4];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			sum = sum+a[i];
		}
		System.out.println("total sum:" + sum);
	}

}
