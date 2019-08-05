package com.lukmie.exe7_howManyDaysInMonth;

import java.time.YearMonth;
import java.util.Scanner;

public class Exercise7 {
    static int month = 0;
    static int year = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        daysInMonth();

    }

    private static void getData() {
        System.out.println("Input a month number: ");
        month = Integer.parseInt(sc.nextLine());
        System.out.println("Input a year: ");
        year = Integer.parseInt(sc.nextLine());
    }

    public static void daysInMonth() {
        getData();
        YearMonth yearMonth = YearMonth.of(year, month);
        System.out.println(yearMonth.lengthOfMonth());
    }
}
