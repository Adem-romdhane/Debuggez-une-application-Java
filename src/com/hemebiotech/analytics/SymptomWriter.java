package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class SymptomWriter implements ISymptomWriter {

    private String filePath;

    public SymptomWriter(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void symptomWriter(Map<String, Integer> symptomOccurrence) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath);
        symptomOccurrence.entrySet()//parcourir map
                .stream().sorted(Map.Entry.comparingByKey()).forEach(entry -> {
                    try {
                        fileWriter.write(entry.toString()+"\n");
                        System.out.println(entry);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
        fileWriter.close();

    }


}
