package com.lukmie.exe25_numRhombus;

import java.util.Scanner;

public class Exercise25 {

    static int num = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        numRhombus();
    }

    private static int getData() {
        System.out.println("Input number: ");
        num = Integer.parseInt(sc.nextLine());
        return num;
    }

    private static void numRhombus() {
        int n = getData();
        int count = 1;
        int no_of_spaces = 1;
        int start = 0;

        for (int i = 1; i < 2*n; i++) {

            for (int k = n - no_of_spaces; k > 0; k--) {
                System.out.print(" ");
            }
            if (i < n) {
                start = i;          //for number
                no_of_spaces++;    //for spaces 2
            } else {
                start = n * 2 - i;   //for number
                no_of_spaces--;      //for space
            }
            for (int j = 0; j < count; j++) {
                System.out.print(start);
                if (j < count / 2) {
                    start--;
                } else {
                    start++;
                }
            }
            if (i < n) {
                count = count + 2;
            } else {
                count = count - 2;
            }

            System.out.println();
        }
    }
}
