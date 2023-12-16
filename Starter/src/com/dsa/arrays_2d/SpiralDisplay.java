package com.dsa.arrays_2d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpiralDisplay {
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

        int colStart = 0;
        int rowEnd = n - 1;
        int colEnd = m - 1;
        int rowStart = 0;
        int count = 0;

        while (count < n * m) {

            //Left wall
            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.println(arr[i][colStart]);
                count++;
                if (count >= n * m) {
                    return;
                }
            }
            colStart++;

            //Bottom wall
            for (int i = colStart; i <= colEnd; i++) {
                System.out.println(arr[rowEnd][i]);
                count++;
                if (count >= n * m) {
                    return;
                }
            }
            rowEnd--;

            //Right wall
            for (int i = rowEnd; i >= rowStart; i--) {
                System.out.println(arr[i][colEnd]);
                count++;
                if (count >= n * m) {
                    return;
                }
            }
            colEnd--;

            //Top wall
            for (int i = colEnd; i >= colStart; i--) {
                System.out.println(arr[rowStart][i]);
                count++;
                if (count >= n * m) {
                    return;
                }
            }
            rowStart++;
        }
    }
}
