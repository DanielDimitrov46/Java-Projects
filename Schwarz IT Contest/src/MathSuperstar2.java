import java.util.Scanner;

public class MathSuperstar2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstCylinder = 0;
        double secondCylinder = 0;
        String command = scanner.nextLine();
        double r1 = Double.parseDouble(command.split(",")[0]);
        double h1 = Double.parseDouble(command.split(",")[1]);
        double r2 = Double.parseDouble(command.split(",")[2]);
        double h2 = Double.parseDouble(command.split(",")[3]);
        firstCylinder = (Math.PI*r1*r1*h1)/1000;
        secondCylinder = (Math.PI*r2*r2*h2)/1000;
        if (firstCylinder>secondCylinder){
            System.out.printf("%.2f",firstCylinder);
        }else {
            System.out.printf("%.2f",secondCylinder);
        }

    }
}
