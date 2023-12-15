package com.dsa.arrays_2d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExitPointOfMatrix {
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

        // 0 -> E | 1 -> S | 2 -> W | 3 -> N
        int direction = 0;
        int row = 0;
        int col = 0;

        while (row > -1 && row <= n-1 && col > -1 && col <= m-1) {
            if (arr[row][col] == 1) {
                direction = (direction + 1) % 4;
            }
            if (direction == 0) {
                col++;
            } else if (direction == 1) {
                row++;
            } else if (direction == 2) {
                col--;
            } else if (direction == 3) {
                row--;
            }
        }

        if (direction == 0) {
            System.out.println(row);
            System.out.println(col-1);
        }
        if (direction == 1) {
            System.out.println(row-1);
            System.out.println(col);
        }
        if (direction == 2) {
            System.out.println(row);
            System.out.println(col+1);
        }
        if (direction == 3) {
            System.out.println(row+1);
            System.out.println(col);
        }
    }
}
