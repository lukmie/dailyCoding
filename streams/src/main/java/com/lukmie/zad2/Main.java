package com.lukmie.zad2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer[] tab = new Integer[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(tab));
        Arrays.stream(tab)
                .filter(l -> l%2 == 0)
                .map(l -> l*10)
                .sorted(Collections.reverseOrder())
                .skip(3)
                .forEach(System.out::println);

        int[] ints = Stream.generate(() -> new Random().nextInt(99))
                .limit(10)
                .mapToInt(Integer::intValue)
                .toArray();

        Arrays.stream(ints)
                .filter(n -> n%2 == 0)
                .map(n -> n*10)
                .boxed()
                .sorted(Collections.reverseOrder())
                .skip(3)
                .forEach(System.out::println);
    }
}
