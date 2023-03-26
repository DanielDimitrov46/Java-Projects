package Exercises.secondTerm.Exercise.Week3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("alice29.txt", false);
        Scanner scanner = new Scanner(System.in);
        String row = scanner.nextLine();
        while (row.equals("done")) {
            writer.write(row+"\n");
            row = scanner.nextLine();
        }
        writer.close();
    }
}
