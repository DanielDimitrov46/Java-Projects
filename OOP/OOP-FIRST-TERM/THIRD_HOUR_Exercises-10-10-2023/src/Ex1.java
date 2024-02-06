import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (a > b) {
            double mid = b;
            b = a;
            a = mid;
        }
        System.out.println(a);
        System.out.println(b);
    }
}