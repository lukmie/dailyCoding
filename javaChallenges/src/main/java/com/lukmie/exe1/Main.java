package com.lukmie.exe1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BabyNamesStatistics stats = new BabyNamesStatistics("Popular_Baby_Names.csv");
        System.out.println(stats.showMostPopularNames(10));
        System.out.println(stats.showMostPopularGirlName());
        System.out.println(stats.showMostPopularLetter());
    }
}
