import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int largestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (number>largestNumber){
                largestNumber = number;
            }
            if (number < smallestNumber){
                smallestNumber = number;
            }
            result+=number;
        }
        System.out.println(largestNumber);
        System.out.println(smallestNumber);
        System.out.println(result);
        System.out.println(result/n);
    }
}
