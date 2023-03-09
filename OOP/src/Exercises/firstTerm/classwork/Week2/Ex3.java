package Exercises.firstTerm.classwork.Week2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int currentNumber = scanner.nextInt();
            result += currentNumber;
        }
        System.out.println(result);
    }
}
