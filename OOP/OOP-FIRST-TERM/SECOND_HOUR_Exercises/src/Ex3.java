import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            result+=number;
        }
        System.out.println(result);
    }
}
