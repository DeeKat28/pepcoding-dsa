package com.dsa.patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j < n) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
