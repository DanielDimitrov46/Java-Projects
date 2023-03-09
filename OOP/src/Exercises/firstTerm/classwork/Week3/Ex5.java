package Exercises.firstTerm.classwork.Week3;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        if(isPalindrome(text))
        {
            System.out.println(text+" is a palindrome string");
        }
        else
        {
            System.out.println(text+" is not a palindrome string");
        }

    }

    private static boolean isPalindrome(String text) {
        int left = 0, right = text.length() - 1;

        while(left < right)
        {
            if(text.charAt(left) != text.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
