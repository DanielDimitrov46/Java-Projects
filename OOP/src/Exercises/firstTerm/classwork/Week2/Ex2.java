package Exercises.firstTerm.classwork.Week2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int n2 = 0;
        int n3= 1;
        int n4 = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(n4);
            n4 = n2+n3;
            //0 1 1
            n3 = n2;
            n2 = n4;
        }
    }
}
