package com.lukmie.exe29_howManyDigits;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise29 {

    static String num;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        howManyDigits();
    }

    private static String getData() {
        System.out.println("Input number: ");
        num = sc.nextLine();
        return num;
    }

    private static void howManyDigits() {
        String num = getData();

        if (Long.parseLong(num) > 10_000_000_000L) {
            System.out.println("Number is greater than 10_000_000_000L!");
        }
        String[] s = num.split("");
        System.out.println(s.length);
    }
}
