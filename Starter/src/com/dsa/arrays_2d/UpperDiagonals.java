package com.dsa.arrays_2d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpperDiagonals {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }

        for (int col = 0; col < n; col++) {
            int j = col;
            for (int row = 0; row < n - col; row++) {
                System.out.println(arr[row][j]);
                j++;
            }
        }
    }
}
