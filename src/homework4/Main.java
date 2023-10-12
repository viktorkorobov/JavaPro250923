package homework4;

public class Main {
    public static void main(String[] args) {
        isAnagram anagram=new isAnagram();
        System.out.println(anagram.isAnagram("rat","car"));
        System.out.println(anagram.isAnagram("anagram","nagaram"));
    }
}