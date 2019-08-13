package com.lukmie.exe18_numTriangle3;

import java.util.Scanner;

public class Exercise18 {
    static int num = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        numTriangle();
    }

    private static int getData() {
        System.out.println("Input number: ");
        num = Integer.parseInt(sc.nextLine());
        return num;
    }

    private static void numTriangle() {
        int num = getData();
        int c = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c++ + " ");
            }
                System.out.println();

        }
    }
}
