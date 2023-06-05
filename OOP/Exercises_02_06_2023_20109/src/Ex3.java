import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] myString = input.toCharArray();

        for (int i = 0; i < myString.length - 5; i++) {
            myString[i] = '*';
        }
        String str = String.valueOf(myString[0]);
        for (int i = 1; i < myString.length; i++) {
            str = str + myString[i];
        }
        System.out.println(str);
    }
}

