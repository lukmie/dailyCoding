package com.lukmie.exe1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(showTenMostPopularNames());
//        countLines();
    }

    public static Map<String, Integer> showTenMostPopularNames() throws IOException {
        List<PersonalData> personList = Files.lines(Paths.get("Popular_Baby_Names.csv"))
                .map(p -> new PersonalData(p.split(",")[3], Integer.parseInt(p.split(",")[4])))
                .collect(Collectors.toList());

        Map<String, Integer> unsorted = personList.stream()
                .collect(Collectors.groupingBy(PersonalData::getName, Collectors.summingInt(PersonalData::getCount)));

        return unsorted.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

    }
}
