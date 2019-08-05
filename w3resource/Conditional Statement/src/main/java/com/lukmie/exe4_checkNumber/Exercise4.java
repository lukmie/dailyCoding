package com.lukmie.exe4_checkNumber;

import java.util.Scanner;

public class Exercise4 {
    static double a = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        checkNumber();
    }

    private static double readNumber() {
        System.out.println("Input a: ");
        a = Double.parseDouble(sc.nextLine());
        return a;
    }

    public static void checkNumber() {
        double num = readNumber();
        String number = "";

        if (num > 0) {
            number = "positive";
        } else if (num < 0) {
            number = "negative";
        } else number = "0";

        if (Math.abs(num) < 1.0) {
            number = number + " small";
        } else if (num > 1_000_000.0) {
            number = number + " large";
        }

        System.out.println("Number is: " + number);
    }
}
