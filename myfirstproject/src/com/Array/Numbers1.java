package com.Array;

import java.util.Arrays;

public class Numbers1 {

	public static void main(String[] args) {
		int[] a = { 0, 9, 8, 0, 2, 0, 4, 0 };
		int index = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				index=a[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
