package com.dsa.recursion_on_the_way_up;

import java.util.Scanner;

public class PrintPermutations {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        printPermutations(str, "");
    }

    public static void printPermutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            printPermutations(str.substring(0, i) + str.substring(i+1), ans + str.charAt(i));
        }
    }
}
