package com.dsa.recursion_arrays;

import java.util.Scanner;

public class FirstIndexInArray {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        System.out.println(firstIndex(arr, 0, x));
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if (idx == arr.length)
            return -1;
        if (arr[idx] == x) {
            return idx;
        } else {
            return firstIndex(arr, idx+1, x);
        }
    }
}
