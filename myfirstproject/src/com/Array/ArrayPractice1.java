package com.Array;

public class ArrayPractice1 {

	public static void main(String[] args) {
		int[] a;
		a = new int[5];
		a = new int[] { 10, 20, 30, 40, 50 };

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		int[] b;
		b = new int[5];
		b = new int[] { 10, 20, 30, 40, 50 };
		System.out.println("rever order");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);

		}

		int[] c;
		c = new int[5];
		c = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("sum number");
		System.out.println(c[0] + c[1] + c[2] + c[3] + c[4]);

		int[] d;
		d = new int[5];
		d = new int[] { 1, 2, 3, 4, 5 };
		int total = d[0] + d[1] + d[2] + d[3] + d[4];
		int result = total / 5;
		System.out.println("average");
		System.out.println(result);

		int[] e;
		e = new int[3];
		e = new int[] { 1, 2, 3 };

		if (e[0] > e[1] && e[0] > e[2]) {
			System.out.println(e[0]);
		} else if (e[1] > e[0] && e[1] > e[2]) {
			System.out.println(e[1]);
		} else {
			System.out.println(e[2]);
		}

		int[] f;
		f = new int[10];
		f = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 12 };
		int count = 0;
		for (int i = 0; i < f.length; i++) {
			if (f[i] % 2 == 0) {
				count++;
				System.out.println(f[i]);
			}
		}
		System.out.println("Even num: " + count);

	}

}


