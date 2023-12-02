package com.dsa.starter;

import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int indexVal = 1;
        int inverseNum = 0;
        while (n > 0) {
            int faceVal = n % 10;
            inverseNum += indexVal * (int)Math.pow(10, faceVal-1);
            indexVal++;
            n = n/10;
        }
        System.out.println(inverseNum);
    }
}
