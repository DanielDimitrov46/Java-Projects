package Exercises.firstTerm.Tests;

import java.util.Arrays;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] myArray = new int[100];
        boolean flag = false;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
        }
        Arrays.sort(myArray);
        for (int i = myArray.length-1; i > 0; i--) {
            if (myArray[i]!=myArray[i-1]) {
                System.out.println("Neshto");
                break;
            }else{
                flag = true;
            }
        }
        if (flag) {
            System.out.println(myArray[0]);
        }
    }
}
