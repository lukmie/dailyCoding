package com.lukmie.exe1_isUglyNumber;

import java.util.Scanner;

public class Exercise1 {

    static int num = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        isUglyNumber();
    }

    private static int getData() {
        System.out.println("Input number: ");
        num = Integer.parseInt(sc.nextLine());
        return num;
    }

    public static void isUglyNumber() {
        int flag = 0;
        int n = getData();
        while (n != 1) {
            if (n % 5 == 0) {
                n /= 5;
            } else if (n % 3 == 0) {
                n /= 3;
            } else if (n % 2 == 0) {
                n /= 2;
            } else {
                System.out.println("Not an ugly number.");
                flag = 1;
                break;
            }
        }
        if (flag == 0) System.out.println("Is an ugly number.");
    }

    public static void firstNPrimeNumbers(int n) {

        int count = 0;
        for (int j = 2; count < n; j++) {
            boolean flag = true;
            for (int i = 2; i <= j/2; i++) {
                if (j % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(j);
                count++;
            }
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeNumberInRange(int start, int end) {
        while (start < end) {
            if (isPrimeNumber(start)) System.out.println(start);
            start++;
        }
    }
}
