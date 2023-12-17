package com.dsa.arrays_2d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RingRotate {
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

        int s = Integer.parseInt(br.readLine());
        int r = Integer.parseInt(br.readLine());

        int[] ring = getShell(arr, s);
        rotateShell(ring, r);
        fillShell(arr, s, ring);
        display(arr);
    }

    public static int[] getShell(int[][] arr, int s) {
        int n = arr.length;
        int m = arr[0].length;
        int rowStart = s - 1;
        int colStart = s - 1;
        int rowEnd = n - s;
        int colEnd = m - s;

        int size = 2 * (rowEnd - rowStart + colEnd - colStart);

        int[] oneD = new int[size];
        int count = 0;

        for (int i = rowStart; i <= rowEnd; i++) {
            oneD[count] = arr[i][colStart];
            count++;
        }
        colStart++;

        for (int i = colStart; i<= colEnd; i++) {
            oneD[count] = arr[rowEnd][i];
            count++;
        }
        rowEnd--;

        for (int i = rowEnd; i >= rowStart; i--) {
            oneD[count] = arr[i][colEnd];
            count++;
        }
        colEnd--;

        for (int i = colEnd; i >= colStart; i--) {
            oneD[count] = arr[rowStart][i];
            count++;
        }

        return oneD;
    }

    public static void rotateShell(int[] arr, int k) {
        int n = arr.length;
        k = ((k % n) + n) % n;
        reverseArray(arr, 0, n - k - 1);
        reverseArray(arr, n - k, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void fillShell(int[][] arr, int s, int[] rotated) {
        int n = arr.length;
        int m = arr[0].length;
        int rowStart = s - 1;
        int colStart = s - 1;
        int rowEnd = n - s;
        int colEnd = m - s;

        int count = 0;

        for (int i = rowStart; i <= rowEnd; i++) {
            arr[i][colStart] = rotated[count];
            count++;
        }
        colStart++;

        for (int i = colStart; i<= colEnd; i++) {
            arr[rowEnd][i] = rotated[count];
            count++;
        }
        rowEnd--;

        for (int i = rowEnd; i >= rowStart; i--) {
            arr[i][colEnd] = rotated[count];
            count++;
        }
        colEnd--;

        for (int i = colEnd; i >= colStart; i--) {
            arr[rowStart][i] = rotated[count];
            count++;
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
