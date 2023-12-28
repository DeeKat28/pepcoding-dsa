package com.dsa.recursion_on_the_way_up;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintSubsequence {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        printSS(str, "");
    }

    public static void printSS(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        printSS(str.substring(1), ans + str.charAt(0));
        printSS(str.substring(1), ans);
    }
}
