import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        if (x > y) {
            double mid = y;
            y = x;
            x = mid;
        }
        System.out.println(x);
        System.out.println(y);
    }
}
