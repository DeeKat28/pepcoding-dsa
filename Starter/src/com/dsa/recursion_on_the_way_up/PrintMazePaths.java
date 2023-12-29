package com.dsa.recursion_on_the_way_up;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintMazePaths {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        printMazePaths(0, 0, n-1, m-1, "");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String ans) {
        if (sr == dr && sc == dc) {
            System.out.println(ans);
            return;
        }
        if (sr > dr || sc > dc) {
            return;
        }

        printMazePaths(sr, sc + 1, dr, dc, ans + "h");
        printMazePaths(sr + 1, sc, dr, dc, ans + "v");
    }
}
