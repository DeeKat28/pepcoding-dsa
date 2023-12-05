package com.dsa.patterns;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int tabs = n/2 - 1;
        int mid_tabs = 1;

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n-1) {
                for (int j = 0; j < n/2; j++) {
                    System.out.print("\t");
                }
                System.out.print("*\t");
                for (int j = 0; j < n/2; j++) {
                    System.out.print("\t");
                }
                System.out.println();
            }
            else {
                for (int j = 0; j < tabs; j++) {
                    System.out.print("\t");
                }
                System.out.print("*\t");
                for (int j = 0; j < mid_tabs; j++) {
                    System.out.print("\t");
                }
                System.out.print("*\t");
                for (int j = 0; j < tabs; j++) {
                    System.out.print("\t");
                }
                System.out.println();
                if (i < n/2) {
                    tabs--;
                    mid_tabs += 2;
                } else {
                    tabs++;
                    mid_tabs -= 2;
                }
            }
        }
    }
}
