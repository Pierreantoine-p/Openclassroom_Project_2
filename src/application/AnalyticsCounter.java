package application;

import implement.ISymptomCount;
import implement.ISymptomReader;
import methods.ReadSymptomDataFromFile;
import methods.CountSymptomDataFromReader;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
    public void analyse() {

        final ISymptomReader getSymptoms = new ReadSymptomDataFromFile();
        final ISymptomCount countSymptoms = new CountSymptomDataFromReader();


        List<String> result = getSymptoms.getSymptoms("Openclassroom_Project_2/symptoms.txt");
        countSymptoms.countSymptoms(result);
        Map<String, Integer> resultCount = countSymptoms.countSymptoms(result);


    }
}