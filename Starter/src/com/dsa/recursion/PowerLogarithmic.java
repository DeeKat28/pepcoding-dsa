package com.dsa.recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PowerLogarithmic {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        System.out.println(power(x, n));
    }

    public static int power(int x, int n){
        if (n == 0) {
            return 1;
        }
        int result = power(x, n/2);
        if (n % 2 == 0) {
            result *= result;
        } else {
            result = result * result * x;
        }
        return result;
    }
}
