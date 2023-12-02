package com.dsa.starter;

import java.util.Scanner;

public class PrintFibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
