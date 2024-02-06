import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean isSymmetric = isArraySymmetric(arr);

        if (isSymmetric) {
            System.out.println("The array is symmetric.");
        } else {
            System.out.println("The array is not symmetric.");
        }
    }

    public static boolean isArraySymmetric(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            if (arr[i] != arr[length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
