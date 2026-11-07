package com.languagefundamentals.methods;

public class Findnum {
	int a = 10;
	int b = 20;

	public static void main(String[] args) {
		 Findnum f = new  Findnum();
		 f.findmax();

	}
	void findmax() {
		if(a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}

}
