package com.dsa.starter;

import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        int dividend = Math.max(num1, num2);
        int divisor = Math.min(num1, num2);
        int hcf, lcm;

        while (true) {
            int rem = dividend % divisor;
            if(rem == 0) {
                hcf = divisor;
                break;
            }
            else {
                dividend = divisor;
                divisor = rem;
            }
        }

        System.out.println("GCD = " + hcf);

        lcm = (num1 * num2) / hcf;

        System.out.println("LCM = " + lcm);
    }
}
