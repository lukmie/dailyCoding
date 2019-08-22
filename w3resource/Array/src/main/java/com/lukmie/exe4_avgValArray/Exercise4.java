package com.lukmie.exe4_avgValArray;

public class Exercise4 {

    private static int[] intTab = {20, 30, 25, 35, -16, 60, -100};

    public static void main(String[] args) {
        System.out.println(avgValArray(intTab));
    }

    public static double avgValArray(int[] array) {
        double sum = 0;
        double avg;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        avg = sum/array.length;
        return avg;
    }

}
