package com.lukmie.exe20_numTriangle5;

import java.util.Scanner;

public class Exercise20 {

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
        String c1;
        String c2;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                c1 = "1";
                c2 = "0";
            } else {
                c1 = "0";
                c2 = "1";
            }
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print(c1);
                } else System.out.print(c2);
            }
            System.out.println();

        }
    }
}
