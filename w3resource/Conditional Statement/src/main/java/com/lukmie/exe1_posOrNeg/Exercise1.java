package com.lukmie.exe1_posOrNeg;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int num = Integer.parseInt(sc.nextLine());
        posOrNeg(num);
        sc.close();
    }

    public static void posOrNeg(int num) {
        if (num > 0) {
            System.out.println("Number is positive.");
        } else if (num < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Zero.");
        }
    }
}
