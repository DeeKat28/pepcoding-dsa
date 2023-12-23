package com.dsa.recursion_arrays;

import java.util.Scanner;

public class LastIndexInArray {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        System.out.println(lastIndex(arr, 0, x));
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if (idx == arr.length)
            return -1;
        int res = lastIndex(arr, idx+1, x);
        if (res == -1 && arr[idx] == x) {
            return idx;
        }
        else {
            return res;
        }
    }
}
