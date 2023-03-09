package Exercises.firstTerm.classwork.Week4;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {
    public static void printSeparator(int[] myArray, String sep){
        for (int i = 0; i < myArray.length-1; i++) {
            int current = myArray[i];
            System.out.printf("%d%s",current,sep);
        }
        System.out.println(myArray[myArray.length-1]);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sep = scanner.nextLine();
        int n = scanner.nextInt();
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            int current = scanner.nextInt();
            myArray[i] = current;
        }
        printSeparator(myArray,sep);
    }
}
