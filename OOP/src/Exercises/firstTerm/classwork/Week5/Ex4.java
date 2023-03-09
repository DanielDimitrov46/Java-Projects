package Exercises.firstTerm.classwork.Week5;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex4 {
    public static int node(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (!map.containsKey(i)) {
                map.put(i, 0);
            }
            int occur = map.get(i);
            occur++;
            map.put(i, occur);
        }
        int nodeN = -1;
        int max_occur = 0;
        for (int i :
                map.keySet()) {
            if (map.get(i) > max_occur) {
                nodeN = i;
                max_occur = map.get(i);
            }
        }
        return nodeN;
    }

    public static void main(String[] args) {
        int[] myArray = {20,20,10,4,5};
        System.out.println(node(myArray));
    }
}
