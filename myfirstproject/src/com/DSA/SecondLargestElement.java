package com.DSA;

public class SecondLargestElement {

	public static void main(String[] args) {
		int[] a = { 10, 50, 30, 80, 60 };
		int largest = a[0];
		int secondlargest = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
				largest = a[i];
			}
			else if (a[i] > secondlargest && a[i]!= secondlargest) {
				secondlargest = a[i];
			}
		}
		System.out.println(secondlargest);

	}

}
