import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println(firstNumber);
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            {
                System.out.println(secondNumber);
            }
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println(thirdNumber);
        }
    }
}
