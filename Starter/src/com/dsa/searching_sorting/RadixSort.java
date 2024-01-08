package com.dsa.searching_sorting;

import java.util.Scanner;

public class RadixSort {
    public static void radixSort(int[] arr) {
        int maxNo = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNo)
                maxNo = arr[i];
        }

        for (int exp = 1; maxNo / exp > 0; exp = exp * 10) {
            countSort(arr, exp);
        }
    }

    public static void countSort(int[] arr, int exp) {
        // write code here
        int[] freq = new int[10];
        for (int i = 0; i < arr.length; i++) {
            freq[(arr[i] / exp) % 10]++;
        }

        int[] prefixSum = new int[10];
        for (int i = 0; i < 10; i++) {
            if (i == 0)
                prefixSum[i] = freq[i];
            else
                prefixSum[i] = prefixSum[i-1] + freq[i];
        }

        int[] result = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) {
            int idx = (arr[i] / exp) % 10;
            result[prefixSum[idx]-1] = arr[i];
            prefixSum[idx]--;
        }

        for (int i = 0; i < result.length; i++) {
            arr[i] = result[i];
        }
        System.out.print("After sorting on " + exp + " place -> ");
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        radixSort(arr);
        print(arr);
    }
}
