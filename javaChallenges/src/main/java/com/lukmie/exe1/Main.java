package com.lukmie.exe1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(countLines());
//        countLines();
    }

    public static List<PersonalData> countLines() throws IOException {
        Files.lines(Paths.get("Popular_Baby_Names.csv"))
                .map(p -> new PersonalData(p.split(",")[3], Long.parseLong(p.split(",")[4])))
                .collect(Collectors.toList());

    }
}
