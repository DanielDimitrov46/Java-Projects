package Exercises.firstTerm.classwork.Week2;

import java.util.Scanner;

public class Ex5 {
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;

        for (int i = 2; i <= (int) Math.sqrt(n); i++)
            if (n % i == 0)
                return false;

        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean flag = isPrime(number);
        if (flag) {
            System.out.println(number);
        }else {
            System.out.println("false");
        }

    }
}
