package com.dsa.arrays_2d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StateOfWakanda1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }

        for (int col = 0; col < m; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < n; row++) {
                    System.out.println(arr[row][col] + "\t");
                }
            } else {
                for (int row = n-1; row >= 0; row--) {
                    System.out.println(arr[row][col] + "\t");
                }
            }
        }
    }
}
