package com.lukmie.exe17_numTriangle2;

import java.util.Scanner;

public class Exercise17 {

    static int num = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        numTriangle();
    }

    private static int getData() {
        System.out.println("Input number of rows: ");
        num = Integer.parseInt(sc.nextLine());
        return num;
    }

    private static void numTriangle() {
        int num = getData();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
