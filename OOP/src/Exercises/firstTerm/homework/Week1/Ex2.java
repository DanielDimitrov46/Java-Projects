package Exercises.firstTerm.homework.Week1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        double farenhait = celsius *1.8+32;
        System.out.printf("%.2f",farenhait);
    }
}
