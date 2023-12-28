package com.dsa.recursion_arraylist;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GetMazePathsWithJumps {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        ArrayList<String> al = getMazePaths(0, 0, n-1, m-1);
        System.out.println(al);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc) {
            ArrayList<String> al = new ArrayList<>();
            al.add("");
            return al;
        }
        if (sr > dr || sc > dc) {
            return new ArrayList<>();
        }

        ArrayList<String> result = new ArrayList<>();

        //Horizontal Path
        for (int i = 1; sc + i <= dc; i++) {
            ArrayList<String> hPaths = getMazePaths(sr, sc+i, dr, dc);
            for (String path: hPaths) {
                result.add("h"+i+path);
            }
        }

        //Vertical Path
        for (int i = 1; sr + i <= dr; i++) {
            ArrayList<String> vPaths = getMazePaths(sr+i, sc, dr, dc);
            for (String path: vPaths) {
                result.add("v"+i+path);
            }
        }

        //Diagonal Path
        for (int i = 1; sc + i <= dc && sr + i <= dr; i++) {
            ArrayList<String> dPaths = getMazePaths(sr+i, sc+i, dr, dc);
            for (String path: dPaths) {
                result.add("d"+i+path);
            }
        }

        return result;
    }
}
