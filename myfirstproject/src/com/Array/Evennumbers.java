package com.Array;

public class Evennumbers {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50, 60 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				System.out.println("even number" + a[i]);
				count++;
			} else {
				System.out.println("odd number");
			}
		}
		System.out.println("total:" + count);
	}
}

