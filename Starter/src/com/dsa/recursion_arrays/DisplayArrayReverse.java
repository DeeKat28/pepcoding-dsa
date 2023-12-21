package com.dsa.recursion_arrays;

import java.util.Scanner;

public class DisplayArrayReverse {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        displayArrReverse(arr, 0);
    }

    public static void displayArrReverse(int[] arr, int idx) {
        if (idx == arr.length)
            return;
        displayArrReverse(arr, idx+1);
        System.out.println(arr[idx]);
    }
}
