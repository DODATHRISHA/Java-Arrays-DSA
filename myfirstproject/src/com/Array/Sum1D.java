package com.Array;

public class Sum1D {

	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 5, 7 };
		int sum = 0;
		double average = 0;
		int max = a[0];
		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];

		}
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}

			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("the maxamimum value is:" + max);
		System.out.println("the minimum number is:" + min);
		average = (double) sum / a.length;
		System.out.println("the total sum is:" + sum);
		System.out.println("the total average is:" + average);
	}

}
