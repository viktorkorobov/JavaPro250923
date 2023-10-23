package List;

import java.util.List;

public class countOccurrence {
    public static int count(List<String> words, String target){
        int count=0;
        for(String word: words){
            if(word.equals(target))count++;
        }
        return count;
    }
}
