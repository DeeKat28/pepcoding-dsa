package com.dsa.starter;

import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int d = noOfDigits(n);

        k = ((k % d) + d) % d;

        int divisor = (int)Math.pow(10, k);
        int rem = n % divisor;
        int rotatedNo = rem * (int)Math.pow(10, d - k) + n / divisor;
        System.out.println(rotatedNo);
    }

    private static int noOfDigits(int x) {
        int count = 0;
        while (x > 0) {
            count++;
            x = x/10;
        }
        return count;
    }
}
