package com.dsa.recursion_on_the_way_up;

import java.util.Scanner;

public class PrintEncodings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        printEncodings(str, "");
    }

    public static void printEncodings(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch1 = str.charAt(0);
        if (ch1 >= '1' && ch1 <= '9')
            printEncodings(str.substring(1), ans + (char)(ch1 - '0' + 96));

        if (str.length() >= 2){
            int ch12 = Integer.parseInt(str.substring(0, 2));
            if (ch12 >= 10 && ch12 <= 26)
                printEncodings(str.substring(2), ans + (char)(ch12 + 96));
        }
    }
}
