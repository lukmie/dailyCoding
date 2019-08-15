package com.lukmie.exe22_pascalTriangle;

import java.util.Scanner;

public class Exercise22 {

    static int num = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        pascalTriangle();
    }

    private static int getData() {
        System.out.println("Input number: ");
        num = Integer.parseInt(sc.nextLine());
        return num;
    }

    private static void pascalTriangle() {
        int row = getData();
        int c = 0;
        for (int i = 0; i < row; i++) {
            for (int k = 1; k <= row - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == 0) {
                    c = 1;
                }
                else {
                    c = c * (i - j + 1) / j;
                }
                System.out.print(" " + c);
            }
            System.out.println();
        }
    }
}
