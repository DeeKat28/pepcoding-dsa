package com.dsa.searching_sorting;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumPair1 {
    public static void targetSumPair(int[] arr, int target){
        int i = 0;
        int j = arr.length - 1;
        Arrays.sort(arr);
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
                System.out.println(arr[i] + ", " + arr[j]);
                i++;
                j--;
            }
            else if (sum > target) {
                j--;
            }
            else {
                i++;
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i < n; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        targetSumPair(arr,target);
    }
}
