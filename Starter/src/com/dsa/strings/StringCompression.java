package com.dsa.strings;

import java.util.Scanner;

public class StringCompression {
    public static String compression1(String str){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                i++;
            }
        }

        return sb.toString();
    }

    public static String compression2(String str){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            int count = 1;
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                i++;
                count++;
            }
            if (count > 1) {
                sb.append(count);
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }
}
