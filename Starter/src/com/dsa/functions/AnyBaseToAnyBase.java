package com.dsa.functions;

import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int  destBase= scn.nextInt();
        System.out.println(getValueInBase(getValueIndecimal(n, sourceBase), destBase));
    }

    public static int getValueIndecimal(int n, int b){
        int result = 0;
        int power = 0;
        while (n > 0) {
            int rem = n % 10;
            result = result + rem * (int)Math.pow(b, power);
            power++;
            n /= 10;
        }
        return result;
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
