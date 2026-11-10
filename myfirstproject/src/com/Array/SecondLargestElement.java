package com.Array;

public class SecondLargestElement {

	public static void main(String[] args) {
		int[] a = { 10, 45, 20, 89, 34, 67, 100 };
		int secound = a[0];
		int largest = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
				secound = largest;
				largest = a[i];

			} else if (a[i] > secound && a[i] != largest) {
				secound = a[i];
			}

		}
		System.out.println("the secound argest number is:" + secound);

	}

}
