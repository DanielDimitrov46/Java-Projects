package Exercises.firstTerm.homework.Week2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int length = String.valueOf(number).length();
        int firstNumber = 0;
        int lastNumber = 0;
        String result = "";
        int finalNumber = 0;

        if (length==4){
            firstNumber = (number / 1000)%10;
            int middleNumber1 = (number/100)%10;
            int middleNumber2 = (number/10)%10;
            lastNumber = number % 10;
            String s1 = Integer.toString(firstNumber);
            String s2 = Integer.toString(lastNumber);
            String s3 = Integer.toString(middleNumber1);
            String s4 = Integer.toString(middleNumber2);
            result = s2 + s3 + s4 + s1;
            finalNumber = Integer.parseInt(result);
        }else if (length==3){
            firstNumber = (number / 100);
            int middleNumber = (number / 10)%10;
            lastNumber = number % 10;
            String s1 = Integer.toString(firstNumber);
            String s2 = Integer.toString(lastNumber);
            String s3 = Integer.toString(middleNumber);
            result = s2 + s3 + s1 ;
            finalNumber = Integer.parseInt(result);
        }else if (length==2){
            firstNumber = (number / 10);
            lastNumber = number % 10;
            String s1 = Integer.toString(firstNumber);
            String s2 = Integer.toString(lastNumber);
            String s = s2 + s1;
            finalNumber = Integer.parseInt(s);
        }else{
            firstNumber = (number / 10000)%10;
            int middleNumber1 = (number/1000)%10;
            int middleNumber2 = (number/100)%10;
            int middleNumber3 = (number/10)%10;
            lastNumber = number % 10;
            String s1 = Integer.toString(firstNumber);
            String s2 = Integer.toString(lastNumber);
            String s3 = Integer.toString(middleNumber1);
            String s4 = Integer.toString(middleNumber2);
            String s5 = Integer.toString(middleNumber3);
            result = s2 + s3 + s4+s5 + s1;
            finalNumber = Integer.parseInt(result);
        }
        System.out.println(number);
        System.out.println(finalNumber);
    }
}
