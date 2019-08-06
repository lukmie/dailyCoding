package com.lukmie.exe12_sumAvg;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise12 {

    static String num = "";
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        sumAvg();
    }

    private static double[] getData() {
        System.out.println("Input 5 numbers: ");
        num = sc.nextLine();
        String[] nums = (num.split("([^\\d]+)"));
        double numbers[] = new double[nums.length];

        for (int i = 0; i < nums.length; i++) {
            numbers[i] = Double.parseDouble(nums[i]);
        }
        System.out.println(Arrays.toString(numbers));
        return numbers;
    }

    public static void sumAvg() {
        double[] nums = getData();
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("The Sum is: " + sum);
        avg = sum/(nums.length);
        System.out.println("The Average is: " + avg);
    }


}
