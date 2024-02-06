import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number you want: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter the second number you want: ");
        double secondNumber = scanner.nextDouble();
        scanner.nextLine();
        if (firstNumber>secondNumber) {
            System.out.println(firstNumber);
        } else if (secondNumber>firstNumber) {
            System.out.println(secondNumber);

        }
        System.out.println("Enter operation: ");
        String operation = scanner.next();
        switch (operation) {
            case "plus":
                CalculatorUtil.plus(firstNumber, secondNumber);
                break;
            case "power":
                CalculatorUtil.power(firstNumber, secondNumber);
                break;
            case "minus":
                CalculatorUtil.minus(firstNumber, secondNumber);
                break;
            case "divide":
                CalculatorUtil.divide(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Wrong operation!");
                break;
        }

    }
}
