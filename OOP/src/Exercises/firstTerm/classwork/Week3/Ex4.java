package Exercises.firstTerm.classwork.Week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            int currentNumber = scanner.nextInt();
            numbers[i] = currentNumber;
        }
        int numberToCheck = scanner.nextInt();
        int position = -1;
        for (int i = 0; i < numbers.length; i++) {
            int foundNumber = numbers[i];
            if (foundNumber == numberToCheck) {
                position = i;
            }
        }
        System.out.println(position);
    }
}
