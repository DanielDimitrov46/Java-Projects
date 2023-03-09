package Exercises.firstTerm.classwork.Week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            double number = scanner.nextDouble();
            list.add(number);
        }
        for (int i = n-1; i >= 0; i--) {
            System.out.printf("%.0f\n",list.get(i));
        }
    }
}
