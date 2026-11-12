package com.Array;

import java.util.Arrays;

public class Numbers {

	public static void main(String[] args) {
		int[] a = { 1, 0, 3, 2, 0, 9, 0, 8, 0, 7 };
		int index = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				int t = a[i];
				a[i] = a[index];
				a[index] = t;
				index++;
			}
		}
		System.out.println(Arrays.toString(a));

	}
}
