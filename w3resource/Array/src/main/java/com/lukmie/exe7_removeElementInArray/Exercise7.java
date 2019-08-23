package com.lukmie.exe7_removeElementInArray;

import java.util.Arrays;

public class Exercise7 {

    private static int[] intTab = {20, 30, 25, 35, -16, 60, -100};

    public static void main(String[] args) {
        removeElement(intTab, 0);
    }

    public static void removeElement(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i >= index){
                newArray[i] = array[i+1];
            } else {
                newArray[i] = array[i];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
