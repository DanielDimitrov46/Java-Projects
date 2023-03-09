package Exercises.firstTerm.classwork.Week2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int remainder = 0;
        int reverseNumber =0;
        while (number!=0){
            remainder = number%10;
            reverseNumber = reverseNumber*10+remainder;
            number = number/10;
        }
        System.out.println(reverseNumber);
    }
}
