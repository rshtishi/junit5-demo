package com.github.rshtishi.junit5.basic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GradeService {

    private String content;

    public GradeService(String fileStr) {
        byte[] fileContent = new byte[0];
        try {
            fileContent = Files.readAllBytes(Paths.get(fileStr));
        } catch (IOException e) {
            e.printStackTrace();
        }
        content = new String(fileContent);
    }

    public int average() {
        String[] gradeArray = content.split(" ");
        int sum = Stream.of(gradeArray)
                .map(s -> Integer.parseInt(s))
                .reduce(0, (a, b) -> a + b);
        return sum / gradeArray.length;
    }

    public int moda() {
        Map<String, Integer> map = Stream.of(content.split(" "))
                .collect(Collectors.toMap(key -> key, value -> 1, (a, b) -> a + b));
        Map.Entry<String, Integer> highestFreqEntry = map.entrySet().stream().max((e1, e2) -> Integer.compare(e1.getValue(), e2.getValue())).get();
        return Integer.parseInt(highestFreqEntry.getKey());
    }
}
