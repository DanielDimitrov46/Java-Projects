package Exercises.firstTerm.homework.Week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringNumber = scanner.nextLine();
        ArrayList<Integer> arr1 = new ArrayList<>();
        int number = Integer.parseInt(stringNumber);
        int i = 1;
        do {
            if (number%i==0) {
                number/=i;
                arr1.add(i);
            }
            if (number<10){
                for (int j = 9; j >1; j--) {
                    if (number%j==0){
                        number/=j;
                        arr1.add(j);
                    }
                }
                break;
            }
            i++;
        }while (number>0);
        Collections.sort(arr1);
        for (int j = 0; j < arr1.size(); j++) {
            System.out.print(arr1.get(j)+".");
            System.out.printf("%d");
        }
    }
}
