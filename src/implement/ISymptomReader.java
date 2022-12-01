package implement;

import java.util.List;

public interface ISymptomReader {

    /**
     * Read a file and output a list
     *
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     * @return [fever ... dialated pupils]
     */
    List<String> getSymptoms(String filepath);

}
