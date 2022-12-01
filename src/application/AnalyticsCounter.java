package application;


import implement.ISymptomReader;
import methods.ReadSymptomDataFromFile;
import java.util.List;


public class AnalyticsCounter {
    public void analyse() {

        final ISymptomReader getSymptoms = new ReadSymptomDataFromFile();


        List<String> result = getSymptoms.getSymptoms("Openclassroom_Project_2/symptoms.txt");
        countSymptoms.countSymptoms(result);


    }
}