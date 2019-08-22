package com.lukmie.exe5_containsAValue;

public class Exercise5 {

    private static int[] intTab = {20, 30, 25, 35, -16, 60, -100};

    public static void main(String[] args) {
        System.out.println(checkTab(intTab, 21));
    }

    public static boolean checkTab(int[] array, int value) {
        boolean flag = false;
        for (int i = 0; i < intTab.length; i++) {
            if (array[i] == value) {
                flag = true;
            }
        }
        return flag;
    }
}
