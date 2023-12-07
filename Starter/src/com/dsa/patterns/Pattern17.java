package com.dsa.patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int tabs = n/2;
        int stars = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < tabs; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < stars; j++) {
                if ( i == n/2 || j >= stars/2) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            if (i < n/2) {
                tabs--;
                stars += 2;
            } else {
                tabs++;
                stars -= 2;
            }
            System.out.println();
        }
    }
}
