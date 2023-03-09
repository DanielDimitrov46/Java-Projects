package Exercises.firstTerm.classwork.Week5;

import java.util.HashMap;

public class Ex2 {
    public static void firstOccurence(String word){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,i);
            }
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        firstOccurence("neshto");
    }
}
