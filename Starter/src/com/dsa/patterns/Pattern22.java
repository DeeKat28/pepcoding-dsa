package com.dsa.patterns;

import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int stars = 2*n-1;
        int tabs = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < tabs; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*\t");
            }
            tabs++;
            stars -= 2;
            System.out.println();
        }
    }
}
