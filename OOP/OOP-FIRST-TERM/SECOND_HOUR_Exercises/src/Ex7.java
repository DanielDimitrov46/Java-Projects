import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        double thirdNumber = scanner.nextDouble();

        if (firstNumber>=secondNumber&&firstNumber>=thirdNumber) {
            if (secondNumber >= thirdNumber) {
                System.out.println("Числата в низходящ ред са: " + firstNumber + ", " + secondNumber + ", " + thirdNumber);
            } else {
                System.out.println("Числата в низходящ ред са: " + firstNumber + ", " + thirdNumber + ", " + secondNumber);
            }
        }else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            if (firstNumber >= thirdNumber) {
                System.out.println("Числата в низходящ ред са: " + secondNumber + ", " + firstNumber + ", " + thirdNumber);
            } else {
                System.out.println("Числата в низходящ ред са: " + secondNumber + ", " + thirdNumber + ", " + firstNumber);
            }
        } else {
            if (firstNumber >= secondNumber) {
                System.out.println("Числата в низходящ ред са: " + thirdNumber + ", " + firstNumber + ", " + secondNumber);
            } else {
                System.out.println("Числата в низходящ ред са: " + thirdNumber + ", " + secondNumber + ", " + firstNumber);
            }
        }
    }
}
