package List;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordOccurrences {
    public static void CalcOccurrences(List<String> words) {
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println("Word: " + entry.getKey() + ", How much repeated: " + entry.getValue());
        }
    }
}
