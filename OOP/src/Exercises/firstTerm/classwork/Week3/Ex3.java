package Exercises.firstTerm.classwork.Week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int currentNumber = scanner.nextInt();
            list.add(currentNumber);

        }
        Collections.sort(list);
        System.out.println(list);
    }
}
