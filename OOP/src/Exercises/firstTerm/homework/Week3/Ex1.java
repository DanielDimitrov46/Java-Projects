package Exercises.firstTerm.homework.Week3;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] numbers = scanner.nextLine().split(" ");
        concatenated(numbers);
    }
    public static void concatenated(String[] numbers){
        String sum = "";
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == null) {

            }
            sum += numbers[i];
        }
        result = Integer.parseInt(sum);
        System.out.println(result);
    }
}
