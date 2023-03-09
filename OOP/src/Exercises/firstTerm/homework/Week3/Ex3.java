package Exercises.firstTerm.homework.Week3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        String[] first = scanner.nextLine().split(" ");
        String[] second = scanner.nextLine().split(" ");
        String[] third = new String[first.length+second.length];
        for (int i = 0; i < first.length; i++) {
            String word = first[i];
            third[i] = word;
        }
        for (int i = 0; i < second.length; i++) {
            String word = second[i];
            third[first.length+index] = word;
            index++;
        }
        System.out.println(Arrays.toString(third));
    }
}
