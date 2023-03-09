package firstTerm;

import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b;
        int a;
        System.out.println("Input a : ");
        a = scanner.nextInt();
        System.out.println();

        System.out.println("Input b : ");
        b = scanner.nextInt();
        System.out.println();

        while (a!=b){
            while (a > b) {
                a = a - b;
            }
            while (b > a) {
                    b = b - a;
            }

        }


        if (a == 1) {
            System.out.println("There is no NOD ! ! !");
        } else {
            System.out.println("N O D is : " + a);
        }

    }
}
