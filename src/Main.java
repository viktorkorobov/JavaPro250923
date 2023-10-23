import phonebook.Recording;
import phonebook.telephoneDirectory;
import java.util.List;
import List.countOccurrence;
import List.ConvertToList;
import java.util.Arrays;

import static List.WordOccurrences.CalcOccurrences;

public class Main {
    public static void main(String[] args) {

        /*1*/
        List<String> wordList = List.of("word1","word2","word3","word4","word1","word3","word1","word4","word2","word1");

        String wordTarget="word1";

        int count = countOccurrence.count(wordList,wordTarget);

        System.out.println("The word: "+wordTarget+"\n" +" repeat times: "+ count);
        /*2*/
        int[] ArrayList= { 1, 2, 3, 11, 3, 5};
        List<Integer> list = ConvertToList.toList(ArrayList);
        System.out.println("List: " + list);

        /*4*/
        List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "apple", "kiwi", "kiwi");
        CalcOccurrences(words);

        /*Telephone Directory*/
        telephoneDirectory telephoneDirectory = new telephoneDirectory();

        Recording recording1 = new Recording("Vi", "123-456-789");
        Recording recording2 = new Recording("Sasha","658-452-842");

        telephoneDirectory.add(recording1);
        telephoneDirectory.add(recording2);

        String forFind1= "Vi1";
        Recording findRecord= telephoneDirectory.find(forFind1);

        if (findRecord != null) {
            System.out.println("Find record: " + forFind1 + ": " + findRecord.getNumber());
        } else {
            System.out.println("Record for: " + forFind1 + " doesn't find");
        }
    }
    }

