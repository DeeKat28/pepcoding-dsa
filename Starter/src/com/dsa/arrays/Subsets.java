package com.dsa.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Subsets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int decNo = 0; decNo < (int)Math.pow(2, n); decNo++) {
            int binaryNo = DecimalToAnyBase(decNo, 2);

            int div = (int)Math.pow(10, n - 1);
            int index = 0;
            while (binaryNo > 0) {
                int bit = binaryNo / div;
                binaryNo = binaryNo % div;
                div /= 10;
                if (bit == 1) {
                    System.out.print(arr[index] + "\t");
                } else {
                    System.out.print("\t");
                }
                index++;
            }
            System.out.println();
        }
    }

    public static int DecimalToAnyBase(int n, int b) {
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
