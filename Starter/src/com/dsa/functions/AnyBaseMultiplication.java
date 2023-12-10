package com.dsa.functions;

import java.util.Scanner;

public class AnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    private static int getProduct(int b, int n1, int n2){
        int result = 0;
        int power = 1;

        while (n1 != 0) {
            int ldn1 = n1 % 10;
            n1 /= 10;

            int pwsd = getProductWithSingleDigit(b, n2, ldn1);
            result = AnyBaseAddition.getSum(b, result, pwsd * power);
            power *= 10;
        }

        return result;
    }

    private static int getProductWithSingleDigit(int b, int n2, int d) {
        int carry = 0;
        int result = 0;
        int power = 1;

        while (n2 != 0 || carry != 0) {
            int ldn2 = n2 % 10;
            n2 /= 10;

            int product = ldn2 * d + carry;

            carry = product / b;
            product = product % b;

            result += product * power;
            power *= 10;
        }
        return result;
    }
}
