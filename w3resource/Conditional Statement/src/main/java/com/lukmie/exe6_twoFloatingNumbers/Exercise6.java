package com.lukmie.exe6_twoFloatingNumbers;

import java.util.Scanner;

public class Exercise6 {
    static double a = 0;
    static double b = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(checkIfNumbersAreEqual());
    }

    private static void readNumber() {
        System.out.println("Input floating-point number: ");
        a = Double.parseDouble(sc.nextLine());
        System.out.println("Input floating-point another number: ");
        b = Double.parseDouble(sc.nextLine());
    }

    public static boolean checkIfNumbersAreEqual() {
        readNumber();
        a = Math.round(a*1000);
        System.out.println(a);
        a = a / 1000;
        System.out.println(a);
        b = Math.round(b*1000);
        b = b / 1000;
        return a == b;
    }

}
