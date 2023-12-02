package com.dsa.starter;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int factor = 2; factor <= (int)Math.sqrt(n); factor++) {
            while (n % factor == 0) {
                System.out.print(factor + " ");
                n = n / factor;
            }
        }
        if (n != 1) {
            System.out.print(n + " ");
        }
    }
}
