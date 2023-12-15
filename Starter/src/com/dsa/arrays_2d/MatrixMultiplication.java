package com.dsa.arrays_2d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixMultiplication {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br.readLine());
        int m1 = Integer.parseInt(br.readLine());

        int[][] a = new int[n1][m1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                a[i][j] = Integer.parseInt(br.readLine());
            }
        }

        int n2 = Integer.parseInt(br.readLine());
        int m2 = Integer.parseInt(br.readLine());

        int[][] b = new int[n2][m2];
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                b[i][j] = Integer.parseInt(br.readLine());
            }
        }

        if (m1 == n2) {
            int[][] c = new int[n1][m2];

            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m2; j++) {
                    for (int k = 0; k < m1; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }

            display(c);
        } else {
            System.out.println("Multiplication not possible");
        }
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
