package Exercises.firstTerm.homework.Week3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] first = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] second = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] third = new int[first.length];
        for (int i = 0; i < first.length; i++) {
            int sum = first[i]+second[i];
            third[i] = sum;
        }
        System.out.println(Arrays.toString(third));
    }
}
