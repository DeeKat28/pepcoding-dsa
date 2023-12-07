package com.dsa.patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int tabs = 2*n - 1 - 2;
        int stars = 1;

        for (int i = 0; i < n; i++) {
            int val = 1;
            for (int j = 0; j < stars; j++) {
                System.out.print(val + "\t");
                val++;
            }
            for (int j = 0; j < tabs; j++) {
                System.out.print("\t");
            }
            if (i == n - 1) {
                stars--;
                val--;
            }
            for (int j = 0; j < stars; j++) {
                val--;
                System.out.print(val + "\t");
            }
            tabs -= 2;
            stars++;
            System.out.println();
        }
    }
}
