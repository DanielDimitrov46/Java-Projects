package Exercises.firstTerm.homework.Week3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] first = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] second = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int index = first.length-1;
        for (int i = 0; i < first.length; i++) {
            System.out.printf("%d %d\n", first[i],second[index]);
            index--;
        }
    }
}
