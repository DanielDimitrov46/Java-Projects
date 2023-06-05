import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        int maxColumn = -1;
        for (int i = 0; i < rows; i++) {
            int sum=0;
            for (int j = 0; j < columns; j++) {
                sum+=matrix[i][j];
            }
            if (sum > max) {
                max = sum;
                maxColumn = i;
            }

    }
        for (int i = 0; i < columns; i++) {
            System.out.println(matrix[maxColumn][i]);
        }
        }

//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                if (matrix[i][j] % 2 == 0) {
//                    System.out.print(matrix[i][j] + " ");
//                }
//            }
//    }
    }

