package com.dsa.recursion_arrays;

import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(maxOfArray(arr, 0));
    }

    public static int maxOfArray(int[] arr, int idx){
        if (idx == arr.length)
            return Integer.MIN_VALUE;
        int element = maxOfArray(arr, idx+1);
        return Math.max(arr[idx], element);
    }
}
