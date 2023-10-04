import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        int largestNumber = Math.max(firstNumber, secondNumber);
        largestNumber = Math.max(largestNumber, thirdNumber);
        int smallestNumber = Math.min(firstNumber,secondNumber);
        smallestNumber = Math.min(smallestNumber, thirdNumber);
        System.out.println(largestNumber+smallestNumber);
    }
}
