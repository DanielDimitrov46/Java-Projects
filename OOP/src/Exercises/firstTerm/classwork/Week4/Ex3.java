package Exercises.firstTerm.classwork.Week4;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static double median(int[] myArray){
        int lengthOfArray = myArray.length;
        Arrays.sort(myArray);
        int medianIndex = myArray.length/2;
        if (lengthOfArray%2==0){
            return (myArray[medianIndex-1]+myArray[medianIndex])/2.0;
        }else{
            return myArray[medianIndex];
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            int current = scanner.nextInt();
            myArray[i] = current;
        }
        System.out.println(median(myArray));
    }
}
