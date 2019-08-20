package com.lukmie.exe2_sumValuesInArray;

public class Exercise2 {

    private static int[] intTab = {2, 4, 67, 23, 11, 43, 33, 90};

    public static void main(String[] args) {
        System.out.println(sumValuesInArray(intTab));
    }

    private static int sumValuesInArray(int[] intTab) {
        int sum = 0;
        for (int i = 0; i < intTab.length; i++) {
            sum += intTab[i];
        }

        return sum;
    }
}
