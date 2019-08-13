package com.lukmie.exe15_oddAndSum;

import java.util.Scanner;

public class Exercise15 {

    static int num = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        oddSum();

    }

    private static int getData() {
        System.out.println("Input number: ");
        num = Integer.parseInt(sc.nextLine());
        return num;
    }

    public static void oddSum() {
        int n = getData();
        int sum = 0;
        System.out.println("The odd numbers are :");
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("The Sum of odd Natural Number upto 5 terms is: " + sum);
    }
}
