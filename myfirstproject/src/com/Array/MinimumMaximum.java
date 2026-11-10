package com.Array;

public class MinimumMaximum {

	public static void main(String[] args) {
		int[] a = { 45, 12, 89, 34, 5, 67, 100, 23 };
		int max = a[0];
		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];	
			} 
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("maximum num is:" + max);
		System.out.println("minimum num is:" + min);

	}

}
