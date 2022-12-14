package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SymptomCountingOccurrency implements ISymptomCountingOccurrency {
    @Override
    public Map<String, Integer> countingOccurrency(List<String> symptoms) {
        return symptoms.stream()
                .filter(word -> !word.isEmpty())
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.summingInt(somme -> 1)));

    }
}
