package com.Array;

public class Elements2D {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 2, 3, 4 }, { 4, 5, 6 } };
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum = sum + a[i][j];
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("the sum of numbres is:" + sum);

	}

}
