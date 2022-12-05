package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class main {
    public static void main(String args[]) throws IOException {

        new SortList().SortList("symptoms.txt","symptoms.txt");
        AnalyticsCounter analyticsCounter= new AnalyticsCounter();
        analyticsCounter.ReadFile();

    }
}
