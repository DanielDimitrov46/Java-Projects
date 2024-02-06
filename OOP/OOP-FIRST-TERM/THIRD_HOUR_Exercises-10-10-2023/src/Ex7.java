import java.util.Arrays;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the arrays (N): ");
        int N = scanner.nextInt();

        int[] array1 = fillArray(N, scanner);
        int[] array2 = fillArray(N, scanner);

        boolean areEqual = Arrays.equals(array1, array2);

        if (areEqual) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

    }

    public static int[] fillArray(int size, Scanner scanner) {
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}


