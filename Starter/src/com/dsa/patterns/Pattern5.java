package com.dsa.patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int tabs = n/2;
        int stars = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= tabs; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*\t");
            }
            if (i <= n/2) {
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
