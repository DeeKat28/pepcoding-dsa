package com.dsa.arrays;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int d = scanner.nextInt();

        System.out.println(findElement(arr, d));
    }

    public static int findElement(int[] arr, int d) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == d) {
                return i;
            }
        }
        return -1;
    }
}
