package Exercises.firstTerm.classwork.Week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sumOfNumbers = 0;
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            double number = scanner.nextDouble();
            list.add(number);
            sumOfNumbers += number;
        }
        double averageSum = sumOfNumbers/ list.size();
        for (int i = 0; i < list.size(); i++) {
            double current = list.get(i);
            if (current > averageSum) {
                System.out.printf("%.0f\n",current);
            }
        }
    }
}
