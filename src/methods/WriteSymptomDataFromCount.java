package methods;

import implement.ISymptomWrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Map;

public class WriteSymptomDataFromCount implements ISymptomWrite {

    /**
     * (non-javadoc)
     *
     * @see implement.ISymptomWrite#writeSymptoms(Map)
     */
    @Override
    public void writeSymptoms(final Map<String, Integer> resultToWrite) {

        try {
            final File fileOut = new File("result.out");

            if (fileOut.createNewFile()) {
                System.out.println("create file: " + fileOut.getName());
            } else {
                System.out.println("File already exists.");
            }

            final BufferedWriter writingFile = new BufferedWriter(new FileWriter(fileOut));
            for (final Map.Entry<String, Integer> entry : resultToWrite.entrySet()) {

                writingFile.write(entry.getKey() + ":"
                        + entry.getValue());
                System.out.println("getKey : " + entry.getKey());
                System.out.println("getValue : " + entry.getValue());

                writingFile.newLine();
            }
            writingFile.flush();

        } catch (final Exception e) {
            e.printStackTrace();
            System.out.println("error : " + e);
        }
    }
}
