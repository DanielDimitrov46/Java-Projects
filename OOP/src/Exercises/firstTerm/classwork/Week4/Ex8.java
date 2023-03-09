package Exercises.firstTerm.classwork.Week4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex8 {
    public static int[] unification(int[] first, int[] second){
//        int[] finalArray = new int[first.length+ second.length];
        return IntStream.concat(Arrays.stream(first), Arrays.stream(second)).toArray();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthFirst = scanner.nextInt();
        int lengthSecond = scanner.nextInt();
        int [] first = new int[lengthFirst];
        int [] second = new int[lengthSecond];
        for (int i = 0; i < lengthFirst; i++) {
            int current = scanner.nextInt();
            first[i] = current;
        }
        for (int i = 0; i < lengthSecond; i++) {
            int current = scanner.nextInt();
            second[i] = current;
        }
        System.out.println(Arrays.toString(unification(first, second)));
    }
}
