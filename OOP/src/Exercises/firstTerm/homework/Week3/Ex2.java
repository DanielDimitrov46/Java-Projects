package Exercises.firstTerm.homework.Week3;

import java.util.Scanner;
import java.util.Arrays;
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] number = scanner.nextLine().split(" ");
        int [] numbers = new int[number.length];
        for (int i = 0; i < number.length; i++) {
            numbers[i] = Integer.parseInt(number[i]);
        }
        upper(numbers);
    }
    public static void upper(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i]* numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
    }
}
