package com.hemebiotech.analytics;

import java.io.*;
import java.util.List;
import java.util.Map;


public class AnalyticsCounter {

    private static final String SYMPTOM_FILE = "symptoms.txt";
    private static final String RESULT_FILE = "result.out";


    public List<String> readSymptom() {
        ReadSymptomDataFromFile read = new ReadSymptomDataFromFile(SYMPTOM_FILE);
        return read.getSymptoms();
    }

    public Map<String, Integer> countingOccurrency(List<String> symptoms) {
        SymptomCountingOccurrency count = new SymptomCountingOccurrency();
        return count.countingOccurrency(symptoms);
    }

    public void symptomWriter(Map<String, Integer> symptomOccurrence) throws IOException {
        SymptomWriter writer = new SymptomWriter(RESULT_FILE);
        writer.symptomWriter(symptomOccurrence);
    }

}
