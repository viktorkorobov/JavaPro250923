package List;

import java.util.ArrayList;
import java.util.List;

public class ConvertToList {
    public static List<Integer> toList(int[] array){
        List<Integer> list = new ArrayList<>();
        for (int num: array){
            list.add(num);
        }return list;
    }

}
