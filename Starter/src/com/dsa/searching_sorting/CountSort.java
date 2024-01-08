package com.dsa.searching_sorting;

import java.util.Scanner;

public class CountSort {
    public static void countSort(int[] arr, int min, int max) {
        int[] freq = new int[max-min+1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i] - min]++;
        }

        int[] prefixSum = new int[max-min+1];
        for (int i = 0; i < freq.length; i++) {
            if (i == 0)
                prefixSum[i] = freq[i];
            else
                prefixSum[i] = prefixSum[i-1] + freq[i];
        }

        int[] result = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int idx = arr[i] - min;
            result[prefixSum[idx] - 1] = arr[i];
            prefixSum[idx]--;
        }

        for (int i = 0; i < result.length; i++) {
            arr[i] = result[i];
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        countSort(arr,min,max);
        print(arr);
    }
}
