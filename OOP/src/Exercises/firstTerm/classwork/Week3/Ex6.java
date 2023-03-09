package Exercises.firstTerm.classwork.Week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int currentNumber = scanner.nextInt();
            arr1.add(currentNumber);
        }
        int i, j;
        for (i = 0; i < arr1.size(); i++) {
            for (j = 0; j < arr1.size(); j++) {
                if (arr1.get(i) != arr1.get(j)&& i!=j) {
                    System.out.println(arr1.get(j));
                }
            }
        }
    }
}
