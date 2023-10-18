import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");
        }
        for (int i = n-1; i >= 1; i--) {
            System.out.print(i+" ");
        }
    }
}
