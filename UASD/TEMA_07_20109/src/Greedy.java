import java.util.Scanner;

public class Greedy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nominals = {50, 20, 10, 5};
        int[] statistics = new int[nominals.length];
        int index = 0;
        int count = 0;
        float sum = 0.0f;
        System.out.print("Input amount in leva: ");
        sum = scanner.nextFloat() * 100;
        System.out.println("Amount in stotinki: " + sum);

        while (sum >= 0) {
            if (sum > nominals[index]) {
                sum -= nominals[index];
                count++;
                statistics[index] += 1;
                System.out.println("Current iteration is: " + count + " Used nominal is: " + nominals[index] + " and remaining amount is: " + sum);
            } else {
                index++;
            }
            if (index > nominals.length - 1) {
                break;
            }
        }
        System.out.printf("Total iterations: %d", count);
        System.out.println();
        for (int i = 0; i < statistics.length; i++) {
            System.out.println("Current nominal: " + nominals[i] + " is used: " + statistics[i]);
        }
    }
}
