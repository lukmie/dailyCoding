package com.lukmie.exe9_leapYearOrNo;

import java.util.Scanner;

public class Exercise9 {

    static int year = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Is year leap? Value: 20" + checkLeapYear());
    }

    private static int getData() {
        System.out.println("Input a year: ");
        year = Integer.parseInt(sc.nextLine());
        return year;
    }

    public static boolean checkLeapYear() {
        int year = getData();
        return  (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }
}
