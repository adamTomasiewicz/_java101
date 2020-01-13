package c_core_collections.pan_tadeusz;

import java.util.Comparator;
import java.util.Map;

public class WordCountComparator implements Comparator <Map.Entry<String, Integer>> {
    @Override
    public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
        return entry1.getValue()-entry2.getValue();
    }
}
