package com.dsa.patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int stars = n;
        for (int i = 0; i < n; i++) {
            for (int j = stars; j >= 1; j--) {
                System.out.print("*\t");
            }
            stars--;
            System.out.println();
        }
    }
}
