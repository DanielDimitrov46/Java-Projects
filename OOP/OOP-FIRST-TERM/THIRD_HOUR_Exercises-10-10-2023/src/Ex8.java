import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean isSorted = isArraySorted(arr);

        if (isSorted) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static boolean isArraySorted(int[] arr) {
        int[] sortedArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArray);
        return Arrays.equals(arr, sortedArray);
    }
}
