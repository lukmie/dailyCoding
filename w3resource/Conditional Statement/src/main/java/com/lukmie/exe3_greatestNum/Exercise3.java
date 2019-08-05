package com.lukmie.exe3_greatestNum;

import java.util.Scanner;

public class Exercise3 {

    private static int a = 0;
    private static int b = 0;
    private static int c = 0;

    public static void main(String[] args) {
        System.out.println("Maximum number is: " + findMax(getData()));
    }

    public static int[] getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the 1st number: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Input the 2nd number: ");
        b = Integer.parseInt(sc.nextLine());
        System.out.println("Input the 3rd number: ");
        c = Integer.parseInt(sc.nextLine());
        int[] tab = {a, b, c};
        return tab;
    }

    public static int findMax(int[] tab) {
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (max < tab[i]) {
                max = tab[i];
            }
        }
        return max;
    }
}
