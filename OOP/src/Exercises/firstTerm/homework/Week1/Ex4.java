package Exercises.firstTerm.homework.Week1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String[] numbers = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] miniNumbers = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        int firstDigit = number / 10;
        int secondDigit = number % 10;
        String firstPart = "";
        String secondPart = "";
        if (secondDigit == 0) {
            System.out.println(numbers[firstDigit - 1]);
        } else {
            secondPart = miniNumbers[secondDigit - 1];
            if (firstDigit < 10) {
                firstPart = numbers[firstDigit - 1];
            } else {
                firstPart = miniNumbers[firstDigit - 1];
            }
            System.out.println(firstPart + "-" + secondPart);
        }


    }
}
