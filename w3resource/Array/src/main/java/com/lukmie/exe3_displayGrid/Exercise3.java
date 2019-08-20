package com.lukmie.exe3_displayGrid;

public class Exercise3 {

    public static void main(String[] args) {
        displayGrid(6);
    }

    public static void displayGrid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("- ");
            }
            System.out.println();
        }
    }
}
