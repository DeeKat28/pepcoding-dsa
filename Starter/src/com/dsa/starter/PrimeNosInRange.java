package com.dsa.starter;

import java.util.Scanner;

public class PrimeNosInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = scanner.nextInt();
        int high = scanner.nextInt();

        for (int i = low; i <= high; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }

    private static boolean isPrime(int x) {
        if (x <= 2) {
            return true;
        }
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
