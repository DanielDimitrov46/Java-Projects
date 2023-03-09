package Exercises.firstTerm.classwork.Week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int currentNumber = scanner.nextInt();
            arr1.add(currentNumber);

        }
    }
}
