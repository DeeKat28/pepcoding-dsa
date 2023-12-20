package com.dsa.recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PowerLinear {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        System.out.println(power(x, n));
    }

    public static int power(int x, int n){
        if (n == 0)
            return 1;
        return x * power(x, n-1);
    }
}
