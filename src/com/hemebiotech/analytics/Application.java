package com.hemebiotech.analytics;


import java.io.IOException;
import java.util.*;

public class Application {
    public static void main(String args[]) throws IOException {
        AnalyticsCounter analyticsCounter = new AnalyticsCounter();
        List<String> symptoms = analyticsCounter.readSymptom();
        Map<String, Integer> occurrenceCount = analyticsCounter.countingOccurrency(symptoms);
        analyticsCounter.symptomWriter(occurrenceCount);
    }
}
