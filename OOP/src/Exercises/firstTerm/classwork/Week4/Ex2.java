package Exercises.firstTerm.classwork.Week4;

import java.util.Scanner;

public class Ex2 {
    public static int biggestNumber(int a, int b, int c) {
        int biggestNumber = a;
        if (biggestNumber < b) {
            biggestNumber = b;
        }
        if (biggestNumber < c) {
            biggestNumber = c;
        }
        return biggestNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(biggestNumber(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
    }
}
