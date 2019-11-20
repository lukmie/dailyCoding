package com.lukmie.exe1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BabyNamesStatistics {
    private String fileName;

    public BabyNamesStatistics(String fileName) {
        this.fileName = fileName;
    }

    public Map<String, Integer> showMostPopularNames(int topNNames) throws IOException {

        LinkedHashMap<String, Integer> maleMap = sortMapsByValue(topNNames, babyNamesMapByGender("MALE"));
        LinkedHashMap<String, Integer> femaleMap = sortMapsByValue(topNNames, babyNamesMapByGender("FEMALE"));

        Map<String, Integer> mostPopularNames = Stream.of(maleMap, femaleMap)
                .map(Map::entrySet)
                .flatMap(Collection::stream)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, Integer::max));

        maleMap.forEach(
                (key, value) -> femaleMap.merge(key, value, (v1, v2) -> v1.equals(v2) ? v1 : v1 + v2)
        );
        System.out.println("****" + sortMapsByValue(topNNames, femaleMap));
        return sortMapsByValue(topNNames, mostPopularNames);
    }

    private LinkedHashMap<String, Integer> sortMapsByValue(int topNNames, Map<String, Integer> map) {
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(topNNames)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }

    public Map<String, Integer> showMostPopularGirlName(int topNNames) throws IOException {
        return babyNamesMapByGender("FEMALE").entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(topNNames)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }

    public Map<String, Integer> showMostPopularLetter() throws IOException {
        List<PersonalData> personList = Files.lines(Paths.get(fileName))
                .map(p -> new PersonalData(p.split(",")[1], p.split(",")[3], Integer.parseInt(p.split(",")[4])))
                .collect(Collectors.toList());

        Map<String, Integer> unsorted = personList.stream()
                .collect(Collectors.groupingBy(p -> p.getName().toUpperCase().substring(0, 1), Collectors.summingInt(PersonalData::getCount)));

        return unsorted.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }

    private Map<String, Integer> babyNamesMapByGender(String gender) throws IOException {
//        return convertSourceFileToList().stream()
//                .filter(g -> g.getGender().equals(gender.toUpperCase()))
//                .collect(Collectors.groupingBy(p -> p.getName().toUpperCase(), Collectors.summingInt(PersonalData::getCount)));
        Map<PersonalData, Integer> collect = convertSourceFileToList().stream()
                .filter(g -> g.getGender().equals(gender.toUpperCase()))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(PersonalData::getCount)));
    }

    private List<PersonalData> convertSourceFileToList() throws IOException {
        return Files.lines(Paths.get(fileName))
                .map(p -> new PersonalData(p.split(",")[1], p.split(",")[3], Integer.parseInt(p.split(",")[4])))
                .collect(Collectors.toList());
    }
}
