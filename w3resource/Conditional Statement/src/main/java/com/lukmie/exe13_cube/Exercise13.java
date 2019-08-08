package com.lukmie.exe13_cube;

import java.util.Scanner;

public class Exercise13 {

    static int num = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        cube();
    }

    private static int getData() {
        System.out.println("Input number: ");
        num = Integer.parseInt(sc.nextLine());
        return num;
    }

    public static void cube() {
        int n = getData();

        for (int i = 1; i <= n; i++) {
            System.out.println("Number is :" + i + "and cube of 1 is: " + i * i * i);
        }
    }
}
