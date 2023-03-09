package Exercises.firstTerm.classwork.Week4;

import java.util.Scanner;

public class Ex9 {
    public static String year(int year) {
        if (year%400==0){
            return "Leap";
        }else if(year%100==0){
            return "Leap";
        }else if(year%4==0){
            return "Leap";
        }
        else{
            return "Not leap";
        }
    }
    public static String years(int[] years) {
        for (int i = 0; i < years.length; i++) {
            int currentYear = years[i];
            if (currentYear%400==0){
                System.out.println("Leap");
            }else if(currentYear%100==0){
                System.out.println("Leap");
            }else if(currentYear%4==0){
                System.out.println("Leap");
            }
            else{
                System.out.println("Not leap");
            }
        }

        return "end";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(year(scanner.nextInt()));
        int n = scanner.nextInt();
        int[] myArr = new int[n];
        for (int i = 0; i < n; i++) {
            int current = scanner.nextInt();
            myArr[i] = current;
        }
        System.out.println(years(myArr));
    }
}
