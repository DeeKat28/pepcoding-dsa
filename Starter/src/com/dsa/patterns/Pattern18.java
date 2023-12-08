package com.dsa.patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int stars = n;
        int tabs = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < tabs; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < stars; j++) {
                if (i > 0 && i < n/2) {
                    if (j == 0 || j == stars - 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else {
                    System.out.print("*\t");
                }
            }
            if (i < n/2) {
                tabs++;
                stars -= 2;
            } else {
                tabs--;
                stars += 2;
            }
            System.out.println();
        }
    }
}
