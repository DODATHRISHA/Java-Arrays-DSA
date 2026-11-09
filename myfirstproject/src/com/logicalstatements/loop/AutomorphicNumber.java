package com.logicalstatements.loop;

import java.util.Scanner;

public class AutomorphicNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");

        int a = sc.nextInt();
        int num = a * a;
        int result = a;
        System.out.println(num);

        int a1 = 0;
        int a2 = 0;
        while (result > 0) {
            a1 = result % 10;//5%10=5
            a2 = num % 10;//25%10 q:2 r:5

            result = result / 10;//5/10=0.5
            num = num / 10;//25 / 10= 2
        }

        if (a1 == a2) {
            System.out.println("it is a AutomorphicNumber");
        } else {
            System.out.println("it is not AutomorphicNumber");
        }
    }
}


