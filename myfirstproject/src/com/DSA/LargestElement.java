package com.DSA;

public class LargestElement {

	public static void main(String[] args) {
		int[] a = { 25, 10, 80, 45, 60 };
		int largest = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i]>largest) {
				largest = a[i];
				System.out.println(largest);
			}
		}

	}
}
