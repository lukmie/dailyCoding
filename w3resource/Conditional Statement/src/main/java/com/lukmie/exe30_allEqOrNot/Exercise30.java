package com.lukmie.exe30_allEqOrNot;

import java.util.Scanner;

public class Exercise30 {

    static int num1 = 0;
    static int num2 = 0;
    static int num3 = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        allEqOrNot();
    }

    private static int[] getData() {
        System.out.println("Input number: ");
        num1 = Integer.parseInt(sc.nextLine());
        num2 = Integer.parseInt(sc.nextLine());
        num3 = Integer.parseInt(sc.nextLine());
        return new int[]{num1, num2, num3};
    }

    private static void allEqOrNot() {
        int[] nums = getData();

        if (nums[0] == nums[1] && nums[1] == nums[2]) {
            System.out.println("All numbers are equal");
        } else if (nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
            System.out.println("Neither all are equal or different");
        } else System.out.println("All numbers are different");
    }
}
