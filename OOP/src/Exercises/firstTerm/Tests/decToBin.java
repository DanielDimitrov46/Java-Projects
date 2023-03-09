package Exercises.firstTerm.Tests;

public class decToBin {
    public static void main(String[] args) {
        int number = 49;
        String binaryResult = "1";
        while (number>0){
            int temp = number%2;
            number/=2;
            String toAdd = Integer.toString(temp);
            binaryResult = toAdd;

        }
        System.out.println("Binary result: " + binaryResult);
    }
}
