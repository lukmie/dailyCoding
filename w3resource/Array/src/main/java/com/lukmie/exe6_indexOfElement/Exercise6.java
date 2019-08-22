package com.lukmie.exe6_indexOfElement;

public class Exercise6 {

    private static int[] intTab = {20, 30, 25, 35, -16, 60, -100};

    public static void main(String[] args) {
        System.out.println(index(intTab, 60));
    }

    public static int index(int[] array, int element) {
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                index = i;
            }
        }

        return index;
    }
}
