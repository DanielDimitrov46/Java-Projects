package firstTerm;

import java.util.ArrayList;
import java.util.Scanner;

public class BoatAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> left = new ArrayList<String>();
        ArrayList<String> right = new ArrayList<String>();
        left.add("goat");
        left.add("wolf");
        left.add("cabbage");

        System.out.println("Choose between wolf and cabbage!");
        String choice = scanner.nextLine();
        int counterOfSteps = 0;
        while (left.size()>0){
            for (int i = 0; i < 3; i++){

                counterOfSteps++;

            }
        }
    }
}
