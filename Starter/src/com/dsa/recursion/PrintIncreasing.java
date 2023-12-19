package com.dsa.recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintIncreasing {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        printIncreasing(n);
    }

    public static void printIncreasing(int n){
        if (n == 0)
            return;
        printIncreasing(n-1);
        System.out.println(n);
    }
}
