package Exercises.firstTerm.homework.Week1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year%4==0){
            if (year%400==0) {
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
    }
}
