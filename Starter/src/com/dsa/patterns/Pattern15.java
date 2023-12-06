package com.dsa.patterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int tabs = n/2;
        int stars = 1;
        int count = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < tabs; j++) {
                System.out.print("\t");
            }
            int temp = count;
            for (int j = 0; j < stars; j++) {
                System.out.print(temp + "\t");
                if (j < stars/2) {
                    temp++;
                } else {
                    temp--;
                }
            }
            if (i < n/2) {
                tabs--;
                stars += 2;
                count++;
            } else {
                tabs++;
                stars -= 2;
                count--;
            }
            System.out.println();
        }
    }
}
