package com.dsa.functions;

import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2){

        int borrow = 0;
        int result = 0;
        int power = 1;

        while (n2 != 0) {
            int ldn1 = n1 % 10;
            int ldn2 = n2 % 10;

            n1 /= 10;
            n2 /= 10;

            int diff = ldn2 - borrow - ldn1;

            if (diff < 0) {
                diff = diff + b;
                borrow = 1;
            } else {
                borrow = 0;
            }

            result = result + diff * power;
            power *= 10;
        }
        return result;
    }
}
