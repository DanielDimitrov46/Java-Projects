import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int biggerNumber = Math.max(firstNumber, secondNumber);
        System.out.println(biggerNumber);
    }
}
