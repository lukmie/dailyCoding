package com.lukmie.exe14_multiTable;

import java.util.Scanner;

public class Exercise14 {
    static int num = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        multi();
    }

    private static int getData() {
        System.out.println("Input number: ");
        num = Integer.parseInt(sc.nextLine());
        return num;
    }

    public static void multi() {
        int n = getData();

        for (int i = 0; i <= n; i++) {
            System.out.println(n + " X " + i + " = " + n * i);
        }
    }
}
