package firstTerm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class findMaxElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of elements:");
        int n = scanner.nextInt();
        int[] myArray = new Random().ints(n, 1, 51).toArray();

        System.out.println(Arrays.toString(myArray));

        int currentMax = myArray[0];
        for (int currElement : myArray) {
            if (currElement > currentMax) {
                currentMax = currElement;
            }
        }
        System.out.printf("Biggest element is: %d\n", currentMax);
    }
}
