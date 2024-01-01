package com.dsa.recursion_and_backtracking;

import java.util.Scanner;

public class NQueens {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] chess = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chess[i][j] = 0;
            }
        }
        printNQueens(chess, "", 0);
    }

    private static void printNQueens(int[][] chess, String qsf, int row) {
        if (row == chess.length) {
            System.out.println(qsf + ".");
            return;
        }

        int columns = chess[0].length;
        for (int col = 0; col < columns; col++) {
            if (isQueenSafe(chess, row, col)) {
                chess[row][col] = 1;
                printNQueens(chess, qsf + row + "-" + col + ",", row+1);
                chess[row][col] = 0;
            }
        }
    }

    private static boolean isQueenSafe(int[][] chess, int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (chess[i][col] == 1)
                return false;
        }
        for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 1)
                return false;
        }
        for (int i = row-1, j = col+1; i >= 0 && j < chess[0].length; i--, j++) {
            if (chess[i][j] == 1)
                return false;
        }
        return true;
    }
}
