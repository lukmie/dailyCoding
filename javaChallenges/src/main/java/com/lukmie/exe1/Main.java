package com.lukmie.exe1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(countLines());
    }

    public static long countLines() throws IOException {
        return Files.lines(Paths.get("Popular_Baby_Names.csv"))
//                .flatMap(l -> Arrays.stream(l.split(",")))
                .flatMap(l -> l.split(","))
                .count();
    }
}
