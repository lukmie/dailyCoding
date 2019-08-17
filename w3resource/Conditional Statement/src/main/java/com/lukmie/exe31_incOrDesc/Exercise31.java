package com.lukmie.exe31_incOrDesc;

import java.util.Scanner;

public class Exercise31 {
    static int num1 = 0;
    static int num2 = 0;
    static int num3 = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        incOrDesc();
    }

    private static int[] getData() {
        System.out.println("Input number: ");
        num1 = Integer.parseInt(sc.nextLine());
        num2 = Integer.parseInt(sc.nextLine());
        num3 = Integer.parseInt(sc.nextLine());
        return new int[]{num1, num2, num3};
    }

    private static void incOrDesc() {
        int[] nums = getData();
        if (nums[0] < nums[1] && nums[1] < nums[2]) {
            System.out.println("Increasing order");
        } else if (nums[0] > nums[1] && nums[1] > nums[2]) {
            System.out.println("Decreasing order");
        } else System.out.println("Neither increasing or decreasing order");
    }
}
