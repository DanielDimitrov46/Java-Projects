package Exercises.firstTerm.homework.Week1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        int[] arr = {firstNumber, secondNumber, thirdNumber};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
