package com.lukmie.zad1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        String alphabet = "ABCDEFGHIJKLMNOPRSTUWXYZ";
        Stream.generate(() -> alphabet.charAt(new Random().nextInt(alphabet.length())))
                .distinct()
                .limit(10)
                .sorted()
                .forEach(System.out::println);
    }
}
