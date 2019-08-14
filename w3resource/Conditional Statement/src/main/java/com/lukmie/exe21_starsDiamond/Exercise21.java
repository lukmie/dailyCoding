package com.lukmie.exe21_starsDiamond;

import java.util.Scanner;

public class Exercise21 {
    static int num = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        upDiamond();
    }

    private static int getData() {
        System.out.println("Input number: ");
        num = Integer.parseInt(sc.nextLine());
        return num;
    }

    private static void upDiamond() {
        int num = getData();
        int n = num;
        for (int i = 1; i <= num; i++) {
            for (int k = n; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            n--;
        }
        downDiamond(num);
    }
    private static void downDiamond(int number) {
        int num = number;
        int n = num;
        for (int i = 1; i < num; i++) {
            for (int k = -1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = n - 1; j >= i; j--) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }
}