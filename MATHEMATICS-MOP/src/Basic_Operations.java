import java.util.Scanner;

public class Basic_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int forRecursion = number;
        int result = 0;
        int maxNumber = Integer.MIN_VALUE;
        while (number != 0) {
            int currentNum = number % 10;
            System.out.println(currentNum);
            result+=currentNum;
            if(currentNum>maxNumber){
                maxNumber = currentNum;
            }
            number /= 10;
        }
        System.out.println(maxNumber);
        System.out.println(result);
        recursionNum(forRecursion);
    }

    public static void recursionNum(int num) {
        int currentNum = num % 10;
        System.out.println(currentNum);
        num /= 10;
        if (num != 0) {
            recursionNum(num);
        }
    }
}