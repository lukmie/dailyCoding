package com.lukmie.exe1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BabyNamesStatistics {
    private String fileName;

    public BabyNamesStatistics(String fileName) {
        this.fileName = fileName;
    }

    public Map<String, Integer> showMostPopularNames(int topNNames) throws IOException {
        Map<String, Integer> unsorted = convertFileToList("FEMALE", "MALE");
        return unsorted.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(topNNames)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }

    public Map<String, Integer> showMostPopularGirlName() throws IOException {
        Map<String, Integer> unsorted = convertFileToList("FEMALE", "");
        return unsorted.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }

    public Map<String, Integer> showMostPopularLetter() throws IOException {
        List<PersonalData> personList = Files.lines(Paths.get("Popular_Baby_Names.csv"))
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

    private Map<String, Integer> convertFileToList(String... gender) throws IOException {
        List<PersonalData> personList = Files.lines(Paths.get(fileName))
                .map(p -> new PersonalData(p.split(",")[1], p.split(",")[3], Integer.parseInt(p.split(",")[4])))
                .filter(g -> g.getGender().equals("FEMALE"))
                .collect(Collectors.toList());

        return convertListToBabyFemaleNamesMap(personList);
    }

    private Map<String, Integer> convertListToBabyFemaleNamesMap(List<PersonalData> personList) {
        return personList.stream()
                .collect(Collectors.groupingBy(p -> p.getName().toUpperCase(), Collectors.summingInt(PersonalData::getCount)));
    }
}
