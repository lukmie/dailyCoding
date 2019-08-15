package com.lukmie.exe23_starsTriangle;

import java.util.Scanner;

public class Exercise23 {
    static int num = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        starTriangle();
    }

    private static int getData() {
        System.out.println("Input number: ");
        num = Integer.parseInt(sc.nextLine());
        return num;
    }

    private static void starTriangle() {
        int num = getData();
        for (int i = 1; i <= num; i++) {
            for (int k = i - 1; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = num; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
