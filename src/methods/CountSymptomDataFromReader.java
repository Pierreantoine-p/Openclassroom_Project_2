package methods;

import implement.ISymptomCount;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CountSymptomDataFromReader implements ISymptomCount {

    /**
     * (non-javadoc)
     *
     * @see implement.ISymptomCount#countSymptoms(List)
     */
    @Override
    public Map<String, Integer> countSymptoms(final List<String> listToCount) {
        final Map<String, Integer> resultCount = new TreeMap<>();

        for (final String element : listToCount) {

            if (element != null) {
                if (!resultCount.containsKey(element)) {
                    resultCount.put(element, 1);
                } else {
                    resultCount.put(element, resultCount.get(element) + 1);
                }
            }
        }
        return resultCount;
    }
}
