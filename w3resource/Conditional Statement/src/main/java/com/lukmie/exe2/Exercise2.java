package com.lukmie.exe2;

import java.util.Scanner;

public class Exercise2 {

    static Scanner sc = new Scanner(System.in);
    static int a = 0;
    static int b = 0;
    static int c = 0;

    public static void main(String[] args) {
        getParams();
        calculateRoots();
    }

    public static void getParams() {
        System.out.println("Input a: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Input b: ");
        b = Integer.parseInt(sc.nextLine());
        System.out.println("Input c: ");
        c = Integer.parseInt(sc.nextLine());
    }

    public static void calculateRoots () {
        double root1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        double root2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
        System.out.println("Root1: " + root1 + "\nRoot2: " + root2);
    }
}
