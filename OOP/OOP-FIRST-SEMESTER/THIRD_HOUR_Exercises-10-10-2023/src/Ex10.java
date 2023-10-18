import java.util.Scanner;

public class Ex10 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int duplicate = findDuplicate(arr);

        if (duplicate != -1) {
            System.out.println("The first duplicate number is: " + duplicate);
        } else {
            System.out.println("No duplicates found in the array.");
        }

        scanner.close();
    }

    public static int findDuplicate(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }

        return -1;
    }
}
