package com.lukmie.exe19_numTriangle4;

import java.util.Scanner;

public class Exercise19 {

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
        int n = num;
        for (int i = 1; i <= num; i++) {
            for (int k = n; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
            n--;
        }

    }
}
