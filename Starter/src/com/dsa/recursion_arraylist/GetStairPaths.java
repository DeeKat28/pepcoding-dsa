package com.dsa.recursion_arraylist;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GetStairPaths {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> ans = getStairPaths(n);
        System.out.println(ans);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if (n == 0) {
            ArrayList<String> al = new ArrayList<>();
            al.add("");
            return al;
        }
        if (n < 0) {
            return new ArrayList<>();
        }

        ArrayList<String> paths1 = getStairPaths(n-1);
        ArrayList<String> paths2 = getStairPaths(n-2);
        ArrayList<String> paths3 = getStairPaths(n-3);

        ArrayList<String> result = new ArrayList<>();

        for (String path: paths1) {
            result.add("1"+path);
        }
        for (String path: paths2) {
            result.add("2" + path);
        }
        for (String path: paths3) {
            result.add("3" + path);
        }
        return result;
    }
}
