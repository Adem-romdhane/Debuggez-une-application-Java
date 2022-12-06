package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class main {
    public static void main(String args[]) throws IOException {


        new SortList().SortList("symptoms.txt", "symptoms.txt");
        AnalyticsCounter analyticsCounter = new AnalyticsCounter();
        analyticsCounter.ReadFile();


        new SortList().SortList("results.out", "results.out");

        WordCountingOccurrency wordCounting = new WordCountingOccurrency("symptoms.txt");
        TreeMap<String, Integer> map = wordCounting.getWordCountingOccurrency();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);


        }
        FileWriter writer = new FileWriter("results.out");
        writer.write(String.valueOf(map)+"\n");
        writer.close();
    }
}
