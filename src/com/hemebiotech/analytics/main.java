package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class main {
    public static void main(String args[]) throws IOException {


        new SortList().SortList("symptoms.txt","symptoms.txt");
        AnalyticsCounter analyticsCounter= new AnalyticsCounter();
        analyticsCounter.ReadFile();




        new SortList().SortList("results.out","results.out");

        WordCounting wordCounting = new WordCounting("symptoms.txt");

        TreeMap<String,Integer> map = wordCounting.getWordCount();

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry);



        }





    }
}
