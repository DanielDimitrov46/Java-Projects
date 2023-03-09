package Exercises.firstTerm.homework.Week2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 0;
        while (number>0){
            result += number%10;
            number = number/10;
        }
        System.out.println(result);
    }
}
