package Exercises.firstTerm.homework.Week2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int counter0 = 0, counter1 = 0, counter2 = 0, counter3 = 0, counter4 = 0, counter5 = 0, counter6 = 0, counter7 = 0, counter8 = 0, counter9 = 0;
        while (number > 0) {
            int currentDigit = number % 10;
            number = number / 10;
            switch (currentDigit) {
                case 0:
                    counter0++;
                    break;
                case 1:
                    counter1++;
                    break;
                case 2:
                    counter2++;
                    break;
                case 3:
                    counter3++;
                    break;
                case 4:
                    counter4++;
                    break;
                case 5:
                    counter5++;
                    break;
                case 6:
                    counter6++;
                    break;
                case 7:
                    counter7++;
                    break;
                case 8:
                    counter8++;
                    break;
                case 9:
                    counter9++;
                    break;
            }
        }
        System.out.printf("Frequency of 0 = %d\n",counter0);
        System.out.printf("Frequency of 1 = %d\n",counter1);
        System.out.printf("Frequency of 2 = %d\n",counter2);
        System.out.printf("Frequency of 3 = %d\n",counter3);
        System.out.printf("Frequency of 4 = %d\n",counter4);
        System.out.printf("Frequency of 5 = %d\n",counter5);
        System.out.printf("Frequency of 6 = %d\n",counter6);
        System.out.printf("Frequency of 7 = %d\n",counter7);
        System.out.printf("Frequency of 8 = %d\n",counter8);
        System.out.printf("Frequency of 9 = %d\n",counter9);
    }
}
