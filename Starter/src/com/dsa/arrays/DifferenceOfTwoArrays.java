package com.dsa.arrays;

import java.util.Scanner;

public class DifferenceOfTwoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        int[] result = new int[Math.max(n1, n2)];

        int i = arr1.length-1, j = arr2.length-1, k = result.length-1;
        int borrow = 0;
        while (j >= 0) {
            int ldn1 = i >= 0 ? arr1[i] : 0;
            int ldn2 = j >= 0 ? arr2[j] : 0;
            int diff = ldn2 - ldn1 - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result[k] = diff;
            i--;
            j--;
            k--;
        }

        // Skipping leading zeroes
        int index = 0;
        while (result[index] == 0) {
            index++;
        }

        for ( ; index < result.length; index++) {
            System.out.println(result[index]);
        }
    }
}
