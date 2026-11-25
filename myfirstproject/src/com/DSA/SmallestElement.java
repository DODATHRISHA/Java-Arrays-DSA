package com.DSA;

public class SmallestElement {

	public static void main(String[] args) {
		int[] a = { 45, 12, 67, 5, 89 };
		int smallest = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < smallest) {
				smallest = a[i];
			}
		}
		System.out.println("the smallest elements:"+smallest);

	}

}
