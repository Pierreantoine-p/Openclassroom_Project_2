package methods;

import implement.ISymptomReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadSymptomDataFromFile implements ISymptomReader {


    /**
     * (non-javadoc)
     *
     * @see implement.ISymptomReader#getSymptoms(String)
     */
    @Override
    public List<String> getSymptoms(final String filepath) {

        final List<String> result = new ArrayList<>();

        try (final BufferedReader reader = new BufferedReader(new FileReader(filepath))) {

            String line = reader.readLine();

            while (line != null) {
                result.add(line.toLowerCase().trim());
                line = reader.readLine();
                System.out.println("line : " + line);
            }

        } catch (final Exception e) {
            e.printStackTrace();
            System.out.println("error : " + e);
        }
        return result;
    }
}
