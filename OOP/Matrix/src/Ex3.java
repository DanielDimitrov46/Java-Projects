import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int [][] matrix = new int[rows+1][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Integer [] input = (Integer[])Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toArray();
                matrix[i][j] = scanner.nextInt();
              }
        }
        for (int i = 0; i < cols; i++) {
            int minVal = matrix[0][i];
            for (int j = 1; j < rows; j++) {
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                }
            }
            matrix[rows][i] = minVal;
        }

        for (int i = 0; i < rows+1; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(" ".repeat(5));
                System.out.println(matrix[i][j]);
            }
        }
    }
}
