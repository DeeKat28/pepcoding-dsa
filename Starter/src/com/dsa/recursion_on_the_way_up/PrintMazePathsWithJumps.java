package com.dsa.recursion_on_the_way_up;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintMazePathsWithJumps {
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

        //horizontal jumps
        for (int i = 1; sc + i <= dc; i++) {
            printMazePaths(sr, sc + i, dr, dc, ans + "h" + i);
        }

        //vertical jumps
        for (int i = 1; sr + i <= dr; i++) {
            printMazePaths(sr + i, sc, dr, dc, ans + "v" + i);
        }

        //diagonal jumps
        for (int i = 1; sc + i <= dc && sr + i <= dr; i++) {
            printMazePaths(sr + i, sc + i, dr, dc, ans + "d" + i);
        }
    }
}
