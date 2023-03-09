package Exercises.firstTerm.classwork.Week5;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex3 {
    public static void printCharsPositions(String word){
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,new ArrayList<>());
            }
            map.get(c).add(i);
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        printCharsPositions("Batence");
    }
}
