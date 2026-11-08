package com.languagefundamentals.methods;

public class StudentConstructor {
	StudentConstructor() {
		String name = "Welcome to Java";
		System.out.println(name);
	}
	
	StudentConstructor(int id,String name) {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		StudentConstructor s = new StudentConstructor(); 
		StudentConstructor s1 = new StudentConstructor(101, "Trisha");
	
		int result=s.Addition(10,20);
		System.out.println(result);
		
		int finalnum =s.Calculator(2);
		System.out.println(finalnum);
		
		int additionnum = s.Calculator(2,2);
		System.out.println(additionnum);

	}
	
	int Addition(int a,int b) {
		int num = a+b;
		return num;
	}
	
	int Calculator(int a) {
		int square = a*a;
		return square;
	}
	int Calculator(int a,int b) {
		int addition = a+b;
		return addition;
	}

}
