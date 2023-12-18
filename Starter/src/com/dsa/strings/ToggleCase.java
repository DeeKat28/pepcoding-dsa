package com.dsa.strings;

import java.util.Scanner;

public class ToggleCase {
    public static String toggleCase(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                sb.append((char)(str.charAt(i) + ('a' - 'A')));
            }
            else {
                sb.append((char)(str.charAt(i) - ('a' - 'A')));
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }
}
