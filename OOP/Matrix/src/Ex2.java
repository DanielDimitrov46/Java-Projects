import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        double [][] matrix = new double[rows][cols+1];

        for (int i = 0; i < rows; i++) {
            double sum = 0;
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextDouble();
                sum+=matrix[i][j];
            }
            matrix[i][cols] = sum/cols;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print((int) matrix[i][j]+(" ".repeat(10)));
            }
            System.out.println(matrix[i][cols]);
        }

    }
}
