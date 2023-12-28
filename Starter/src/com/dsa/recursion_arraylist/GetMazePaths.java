package com.dsa.recursion_arraylist;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GetMazePaths {
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
        if (sr > dc || sc > dc) {
            return new ArrayList<>();
        }

        ArrayList<String> hPaths = getMazePaths(sr, sc+1, dr, dc);
        ArrayList<String> vPaths = getMazePaths(sr+1, sc, dr, dc);

        ArrayList<String> result = new ArrayList<>();

        for (String path: hPaths) {
            result.add("h" + path);
        }
        for (String path: vPaths) {
            result.add("v" + path);
        }

        return result;
    }
}
