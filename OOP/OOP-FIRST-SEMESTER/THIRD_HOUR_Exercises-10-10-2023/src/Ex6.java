import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= i+n-1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
