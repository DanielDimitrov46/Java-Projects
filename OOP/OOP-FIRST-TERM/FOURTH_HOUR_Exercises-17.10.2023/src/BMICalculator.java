import java.util.Scanner;

public class BMICalculator {

    public static void printIntroduction() {
        System.out.println("This program calculates the body mass index(BMI)!");
    }

    public static double getBMI(Scanner scanner) {
        System.out.println("Enter weight and height in inches and pounds: ");
        double weight = scanner.nextDouble();
        double height = scanner.nextDouble();
        height *= 2.54;
        weight /= 2.205;
        System.out.println(weight);
        System.out.println(height);
        return bmiFor(weight, height);
    }

    public static double bmiFor(double weight, double height) {
        double bodyMassIndex = weight * 703 / (height * height);
        return bodyMassIndex;
    }

    public static String getStatus(double massIndex) {
        String status = "";
        if (massIndex <= 18.5) {
            status = "underweight";
        } else if (massIndex <= 25) {
            status = "normal";
        } else if (massIndex <= 30) {
            status = "overweight";
        } else {
            status = "obese";
        }
        return status;
    }

    public static void ReportResults(int numberResult, double bmiIndex, String status) {
        System.out.printf("Person with number %d has BMI index=%.2f, its status is:%s", numberResult, bmiIndex, status);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        boolean flag = true;
        while(flag) {
            printIntroduction();
            double massIndex=getBMI(scanner);
            String status = getStatus(massIndex);
            ReportResults(counter,massIndex,status);
            counter++;
            if (counter>30){
                flag = false;
            }
        }

    }

}