package com.dsa.arrays_2d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SaddlePrice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }

        boolean isSaddleFound = false;

        for (int row = 0; row < n; row++) {

            int min = Integer.MAX_VALUE;
            int minCol = 0;
            for (int j = 0; j < n; j++) {
                if (arr[row][j] < min) {
                    min = arr[row][j];
                    minCol = j;
                }
            }

            int max = Integer.MIN_VALUE;
            int maxRow = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i][minCol] > max) {
                    max = arr[i][minCol];
                    maxRow = i;
                }
            }

            if (min == max) { // maxRow == row
                System.out.println(max);
                isSaddleFound = true;
                break;
            }
        }

        if (!isSaddleFound) {
            System.out.println("Invalid input");
        }
    }
}
