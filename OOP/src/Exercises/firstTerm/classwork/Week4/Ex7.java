package Exercises.firstTerm.classwork.Week4;

import java.util.Scanner;

public class Ex7 {
    public static int mostRecent(int[] myArray){
        int maxOccur = 0;
        int maxElement = 0;
        for (int i = 0; i < myArray.length; i++) {
            int current = myArray[i];
            int occur = 0;
            for (int j = i; j < myArray.length; j++) {
                if (myArray[j]==myArray[i]){
                    occur++;
                    maxElement = myArray[i];
                }
            }
            if (occur>maxOccur){
                maxOccur = occur;
            }
        }
        return maxElement;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            int current = scanner.nextInt();
            myArray[i] = current;
        }
        System.out.println(mostRecent(myArray));

    }
}
