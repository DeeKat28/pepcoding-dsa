package com.dsa.recursion_on_the_way_up;

import java.util.Scanner;

public class PrintKPC {
    private static String[] keypad = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        printKPC(str, "");
    }

    public static void printKPC(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        char c = str.charAt(0);
        String keys = keypad[c - '0'];
        for (int i = 0; i < keys.length(); i++) {
            printKPC(str.substring(1), ans + keys.charAt(i));
        }
    }
}
