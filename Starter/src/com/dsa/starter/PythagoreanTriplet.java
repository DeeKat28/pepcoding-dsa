package com.dsa.starter;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if ((a*a == b*b + c*c)
                ||
                (b*b == c*c + a*a)
                ||
                (c*c == a*a + b*b))
        {
            System.out.print(true);
        }
        else
        {
            System.out.print(false);
        }
    }
}
