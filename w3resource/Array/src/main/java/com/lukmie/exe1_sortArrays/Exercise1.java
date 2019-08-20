package com.lukmie.exe1_sortArrays;

import java.util.Arrays;

public class Exercise1 {

    private static int[] intTab = {2, 4, 67, 23, 11, 43, 33, 90};
    private static String[] stringTab = {"sad", "fat", "home", "win", "create", "open"};

    public static void main(String[] args) {
//        sortIntArray(intTab);
        sortStringArray(stringTab);
    }

    public static void sortIntArray(int[] array) {
        int temp = 0;
        int count = 1;
        while (count > 0) {
            count = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }

    public static void sortStringArray(String[] array) {
        String temp;
        int count = 1;
        while (count > 0) {
            count = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }

}
