import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            if (number > maxNumber){
                maxNumber = number;
            }
        }
        System.out.println(maxNumber);
    }
}
