package Exercises.firstTerm.classwork.Week4;

import java.util.Scanner;

public class Ex5 {
    public static String differentSizeOfCharacters(String word) {
        String finalWord = "";
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c += 'a' - 'A';
                finalWord+=c;
            }
            else if (c >= 'a' && c <= 'z') {
                c+='A'-'a';
                finalWord+=c;
            }
        }
        return finalWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(differentSizeOfCharacters(word));
    }
}
