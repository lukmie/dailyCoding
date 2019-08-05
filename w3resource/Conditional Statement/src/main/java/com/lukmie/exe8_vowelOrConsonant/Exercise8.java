package com.lukmie.exe8_vowelOrConsonant;

import java.util.Scanner;

public class Exercise8 {

    static String data;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        vovelOrConsonant();
    }

    private static String getData() {
        System.out.println("Input a letter: ");
        data = sc.nextLine();
        return data;
    }

    public static void vovelOrConsonant() {
        String str = getData();
        String vovel = "aeiouy";
        if (str.length() > 1 && !str.matches("([A-Za-z])")){
            System.err.println("Error");
        } else if (vovel.contains(str)){
            System.out.println("Input letter is Vowel.");
        } else System.out.println("Input letter is Consonant.");
    }
}
