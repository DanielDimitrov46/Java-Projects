import java.util.Scanner;

public class Basic_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int forRecursion = number;
        int result = 0;
        while (number != 0) {
            int currentNum = number % 10;
            System.out.println(currentNum);
            result+=currentNum;
            number /= 10;
        }
        System.out.println(result);
        recursionNum(forRecursion);
        //obhoshda go
    }

    public static int recursionNum(int num) {
        int currentNum = num % 10;
        System.out.println(currentNum);
        num /= 10;
        if (num != 0) {
            recursionNum(num);
        }
        return num;
    }
}