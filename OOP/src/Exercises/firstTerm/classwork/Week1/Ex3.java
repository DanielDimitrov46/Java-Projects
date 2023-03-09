package Exercises.firstTerm.classwork.Week1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        c=b;
        b=a;
        a=c;
        System.out.println(a);
        System.out.println(b);
    }
}
