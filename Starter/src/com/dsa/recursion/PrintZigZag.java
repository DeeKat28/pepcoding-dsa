package com.dsa.recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintZigZag {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        pzz(n);
    }

    public static void pzz(int n){
        if (n == 0)
            return;
        System.out.print(n + "\t");
        pzz(n-1);
        System.out.print(n + "\t");
        pzz(n-1);
        System.out.print(n + "\t");
    }
}
