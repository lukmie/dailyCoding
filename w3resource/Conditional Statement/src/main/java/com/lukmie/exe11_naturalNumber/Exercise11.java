package com.lukmie.exe11_naturalNumber;

import java.util.Scanner;

public class Exercise11 {

    static int num = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        naturalNumber();
    }

    private static int getData() {
        System.out.println("Input number: ");
        num = Integer.parseInt(sc.nextLine());
        return num;
    }

    public static void naturalNumber() {
        int n = getData();
        int sum = 0;

        System.out.println("The first n natural numbers are:");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("The Sum of Natural Number up to n terms:");
        System.out.println(sum);
    }


}
