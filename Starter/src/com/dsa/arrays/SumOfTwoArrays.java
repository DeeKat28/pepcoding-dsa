package com.dsa.arrays;

import java.util.Scanner;

public class SumOfTwoArrays {
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

        int[] result = new int[Math.max(n1, n2) + 1];

        int i = arr1.length-1, j = arr2.length-1, k = result.length-1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            int ldn1 = i >= 0 ? arr1[i] : 0;
            int ldn2 = j >= 0 ? arr2[j] : 0;
            int sum = ldn1 + ldn2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            result[k] = sum;
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
