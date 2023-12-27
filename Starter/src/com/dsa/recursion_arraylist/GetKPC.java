package com.dsa.recursion_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKPC {
    private static String[] keypad = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        ArrayList<String> ans = getKPC(str);
        System.out.println(ans);
    }

    public static ArrayList<String> getKPC(String str) {
        if (str.length() == 0) {
            ArrayList<String> al = new ArrayList<>();
            al.add("");
            return al;
        }
        ArrayList<String> al = getKPC(str.substring(1));
        char c = str.charAt(0);
        String keys = keypad[c - '0'];

        ArrayList<String> ans = new ArrayList<>();
        for (char ch: keys.toCharArray()) {
             for (String s: al){
                ans.add(ch + s);
            }
        }
        return ans;
    }
}
