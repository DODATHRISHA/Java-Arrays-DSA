package com.Array;

public class PositiveNegative {

	public static void main(String[] args) {
		int[] a = { 10, -5, 20, -8, 0, 30, -2 };
		int positive = 0;
		int negitive = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				negitive++;
			}
			else if (a[i] > 0) {
				positive++;
			}
		}
		System.out.println("the number of poditive:" + positive);
		System.out.println("the number of negitive:" + negitive);

	}

}
