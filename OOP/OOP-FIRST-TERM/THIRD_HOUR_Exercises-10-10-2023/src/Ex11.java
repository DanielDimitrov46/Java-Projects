import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int targetSum = scanner.nextInt();

        int[] pair = findPairWithSum(arr, targetSum);

        if (pair != null) {
            System.out.println("Pair with the target sum: " + pair[0] + " and " + pair[1]);
        } else {
            System.out.println("No pair with the target sum found.");
        }

    }

    public static int[] findPairWithSum(int[] arr, int targetSum) {
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }

        return null;
    }
}
