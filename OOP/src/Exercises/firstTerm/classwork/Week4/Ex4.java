package Exercises.firstTerm.classwork.Week4;

import java.util.Scanner;

public class Ex4 {
    public static String vowels(String word){
        String finalWord="";
        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            switch (current) {
                case 'A':
                case 'a':
                    finalWord+=current;
                    break;
                case 'E':
                case 'e':
                    finalWord+=current;
                    break;
                case 'I':
                case 'i':
                    finalWord+=current;
                    break;
                case 'O':
                case 'o':
                    finalWord+=current;
                    break;
                case 'U':
                case 'u':
                    finalWord+=current;
                    break;
            }
        }
        return finalWord;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(vowels(word));
    }
}
