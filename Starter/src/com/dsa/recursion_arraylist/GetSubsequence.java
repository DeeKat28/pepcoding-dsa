package com.dsa.recursion_arraylist;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GetSubsequence {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        List<String> list = gss(str);
        System.out.println(list);
    }

    public static ArrayList<String> gss(String str) {
        if (str.length() == 0) {
            ArrayList<String> al = new ArrayList<>();
            al.add("");
            return al;
        }
        ArrayList<String> list = gss(str.substring(1));
        ArrayList<String> res = new ArrayList<>(list);
        for (String s: list) {
            res.add(str.charAt(0) + s);
        }
        return res;
    }
}
