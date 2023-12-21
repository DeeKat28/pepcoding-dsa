package com.dsa.recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TowerOfHanoi {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int src = Integer.parseInt(br.readLine());
        int dest = Integer.parseInt(br.readLine());
        int aux = Integer.parseInt(br.readLine());

        toh(n, src, dest, aux);
    }

    public static void toh(int n, int src, int dest, int aux){
        if (n == 0) {
            return;
        }
        toh(n-1, src, aux, dest);
        System.out.println(n + "[" + src + "->" + dest + "]");
        toh(n-1, aux, dest, src);
    }
}
