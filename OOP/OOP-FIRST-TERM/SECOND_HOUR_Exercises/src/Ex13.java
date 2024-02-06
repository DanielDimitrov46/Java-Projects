import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] x = new double[10];
        for (int i = 0; i < 10; i++) {
            double number = scanner.nextDouble();
            x[i] = number;
        }
        double result = 0;
        for (int i = 0; i < x.length; i++) {
            result+=x[i];
        }
        System.out.println(result);
    }
}
