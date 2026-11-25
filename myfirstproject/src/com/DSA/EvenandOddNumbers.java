package com.DSA;

public class EvenandOddNumbers {

	public static void main(String[] args) {
		int[] a = { 10, 15, 20, 25, 30, 35 };
		int even = a[0];
		int odd = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				even = a[i];
				System.out.println("even numbes is:" + even);
			} else {
				System.out.println("odd number"+a[i]);
			}
		}

	}

}
