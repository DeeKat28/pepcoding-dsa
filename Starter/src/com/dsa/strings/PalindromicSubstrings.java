package com.dsa.strings;

import java.util.Scanner;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

    private static void solution(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substring = str.substring(i, j);
                if (isPalindrome(substring)) {
                    System.out.println(substring);
                }
            }
        }
    }

    private static boolean isPalindrome(String substring) {
        for (int i = 0, j = substring.length()-1; i < j; i++, j--) {
            if (substring.charAt(i) != substring.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
