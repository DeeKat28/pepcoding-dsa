package com.dsa.functions;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b){
        int result = 0;
        int power = 0;
        while (n > 0) {
            int rem = n % b;
            result = result + rem * (int)Math.pow(10, power);
            power++;
            n /= b;
        }
        return result;
    }
}
