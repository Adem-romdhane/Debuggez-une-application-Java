package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

public interface ISymptomWriter {
    void symptomWriter(Map<String, Integer> symptomOccurrence) throws IOException;
}
