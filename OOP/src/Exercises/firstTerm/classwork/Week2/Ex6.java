package Exercises.firstTerm.classwork.Week2;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int k = 0;
        if (number%2==0){
            System.out.println("Is not odd");
        }else{
            for (int i = 1; i <= number; i+=2, k=0) {
                for (int j = 0; j < (number-i)/2; j++) {
                    System.out.println(" ");
                }
                while (k!=i){
                    System.out.print("* ");
                    k++;
                }
            }
        }
    }
}
