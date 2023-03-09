package Exercises.firstTerm.classwork.Week1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        String state = "";
        if(grade>=0 && grade<=20) {
            state = "2! Try again next year";
        } else if (grade>=21 && grade<=40) {
            state = "3! Whew, that was a close one";
        } else if (grade>=41 && grade<=60) {
            state = "4! Not much I can say, you are just a regular fellow";
        } else if (grade>=61 && grade<=80) {
            state = "5! If only you didn't go drinking the night before the exam...";
        }else{
            state = "6! There's no way you did this by yourself, how did you cheat?";
        }
    }
}
