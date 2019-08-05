package com.lukmie.exe5_numToWeekDay;

import java.util.Scanner;

public class Exercise5 {
    static int a = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(changeNumToWeekDay());
    }

    private static int readNumber() {
        do{
            System.out.println("Input number between 1 - 7: ");
            try {
                a = Integer.parseInt(sc.nextLine());
            } catch (IllegalArgumentException e){
                System.err.println("Input an integer.");
            }
            if (a < 1 || a > 7) {
                System.out.println("Try again...");
            } else continue;
        } while (a < 1 || a > 7);
        return a;
    }

    public static String changeNumToWeekDay() {
        String weekDay = "";

        switch (readNumber()){
            case 1:
                weekDay = "Monday";
                break;
            case 2:
                weekDay = "Tuesday";
                break;
            case 3:
                weekDay = "Wednesday";
                break;
            case 4:
                weekDay = "Thursday";
                break;
            case 5:
                weekDay = "Friday";
                break;
            case 6:
                weekDay = "Saturday";
                break;
            case 7:
                weekDay = "Sunday";
                break;
            default:
                System.out.println("Error");
        }

        return weekDay;
    }
}
