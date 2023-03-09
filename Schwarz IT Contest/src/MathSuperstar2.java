import java.util.Scanner;

public class MathSuperstar2 {
    public static void main(String[] args) {
        System.out.println("Enter the numbers:");
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxIndex = 0;
        int minIndex = 0;


        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int currentElement = arr[i];

            if (currentElement > max) {
                max = currentElement;
                maxIndex = i;
            }
            if (currentElement < min) {
                min = currentElement;
                minIndex = i;

            }
        }
            System.out.println("The max number is :" + max);
            System.out.println("The index is:" + maxIndex);

            System.out.println("The min number is :" + min);
            System.out.println("The index is:" + minIndex);
    }
}
