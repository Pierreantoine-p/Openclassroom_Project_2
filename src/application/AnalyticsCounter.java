package application;

import implement.ISymptomCount;
import implement.ISymptomReader;
import implement.ISymptomWrite;
import methods.CountSymptomDataFromReader;
import methods.ReadSymptomDataFromFile;
import methods.WriteSymptomDataFromCount;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
    public void analyse() {

        final ISymptomReader getSymptoms = new ReadSymptomDataFromFile();
        final ISymptomCount countSymptoms = new CountSymptomDataFromReader();
        final ISymptomWrite writeSymptoms = new WriteSymptomDataFromCount();


        List<String> result = getSymptoms.getSymptoms("Openclassroom_Project_2/symptoms.txt");
        countSymptoms.countSymptoms(result);
        Map<String, Integer> resultCount = countSymptoms.countSymptoms(result);
        writeSymptoms.writeSymptoms(resultCount);


    }
}