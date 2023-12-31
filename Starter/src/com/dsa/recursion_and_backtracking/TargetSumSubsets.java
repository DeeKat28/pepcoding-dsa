package com.dsa.recursion_and_backtracking;

import java.util.Scanner;

public class TargetSumSubsets {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int tar = scanner.nextInt();
        printTargetSumSubsets(arr, 0, "", 0, tar);
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        if (idx == arr.length) {
            if (sos == tar)
                System.out.println(set);
            return;
        }
        if (sos > tar)
            return;

        printTargetSumSubsets(arr, idx+1, set + "" + arr[idx], sos + arr[idx], tar);
        printTargetSumSubsets(arr, idx+1, set, sos, tar);
    }
}
