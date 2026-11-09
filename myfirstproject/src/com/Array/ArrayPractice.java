package com.Array;

public class ArrayPractice {

	public static void main(String[] args) {
		int[] a;
		a = new int[10];
		a = new int[] { 10, 20, 30, 40, 50 };
		System.out.println(a[0]);
		System.out.println(a[4]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[2]);
		System.out.println(a.length);

		String[] b;
		b = new String[4];
		b = new String[] { "trisha", "divya", "yamuna", "madhavi" };
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);

		char[] c = new char[5];
//		 {'a','b','c','d','d','g','d'};
		c[0] = 'a';
		c[1] = 'a';
		c[2] = 'a';
		c[3] = 'a';
		c[4] = 'a';
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		System.out.println(c[3]);
		System.out.println(c[4]);

		boolean[] b1 = new boolean[5];
		b1[0] = true;
		b1[1] = true;
		b1[2] = true;
		b1[3] = true;
		b1[4] = true;
		System.out.println(b1[0]);
		System.out.println(b1[1]);
		System.out.println(b1[2]);
		System.out.println(b1[3]);
		System.out.println(b1[4]);

		float[] f;
		f = new float[] { 10.9f, 10.6f, 34.5f, 34.9f, 45.7f };
		System.out.println(f[0]);
		System.out.println(f[1]);
		System.out.println(f[2]);
		System.out.println(f[3]);
		System.out.println(f[4]);

		double[] d;
		d = new double[] { 10.9, 10.6, 34.5, 34.9, 45.7 };
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
		System.out.println(d[3]);
		System.out.println(d[4]);

	}

}
