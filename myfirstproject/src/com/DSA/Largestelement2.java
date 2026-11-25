package com.DSA;

public class Largestelement2 {

	public static void main(String[] args) {
		int[][] a = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		int largest = a[0][0];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] > largest) {
					largest = a[i][j];
				}
			}
		}
		System.out.println(largest);

	}

}
