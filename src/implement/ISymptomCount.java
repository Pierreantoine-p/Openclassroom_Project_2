package implement;

import java.util.List;
import java.util.Map;

public interface ISymptomCount {
    /**
     * Counts the number of symptoms and sorts them alphabetically
     *
     * @param listToCount list with symptom strings in it, one per line
     * @return [fever : 5 ... dialated pupils : 1]
     */
    Map<String, Integer> countSymptoms(List<String> listToCount);

}
