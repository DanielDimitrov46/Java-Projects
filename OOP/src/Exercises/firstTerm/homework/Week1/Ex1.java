package Exercises.firstTerm.homework.Week1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reversedNumber = 0;
        while(number!=0){
            int remainder = number%10;
            reversedNumber = reversedNumber*10+remainder;
            number/=10;
        }
        System.out.println(reversedNumber);
    }
}

