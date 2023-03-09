package Exercises.firstTerm.classwork.Week5;

import java.util.HashMap;

public class Ex1 {
    public static int uniqueChars(String word){
        HashMap<Character, Boolean>map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            map.put(word.charAt(i), true);
        }
        return map.size();
    }
    public static void main(String[] args) {
        System.out.println(uniqueChars("null"));
    }
}
