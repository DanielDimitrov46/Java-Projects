package Exercises.firstTerm.homework.Week1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        int fourthNumber = scanner.nextInt();
        int fifthNumber = scanner.nextInt();
        System.out.println(Math.max(Math.max(Math.max(Math.max(firstNumber, secondNumber), thirdNumber), fourthNumber), fifthNumber));
    }
}
