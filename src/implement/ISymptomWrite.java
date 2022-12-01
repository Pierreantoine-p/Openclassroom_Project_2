package implement;

import java.util.Map;

public interface ISymptomWrite {
    /**
     * write the symptoms to a text file named result.out
     *
     * @param resultToWrite Map with symptom count and sorts them alphabetically
     * @return [fever ... dialated pupils]
     */
    void writeSymptoms(Map<String, Integer> resultToWrite);

}
