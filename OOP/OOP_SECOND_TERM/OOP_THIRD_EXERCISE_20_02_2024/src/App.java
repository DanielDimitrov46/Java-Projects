import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            SportsCar car1 = new SportsCar("BMW", 2, 100,250);
            SportsCar car2 = new SportsCar(scanner.nextLine(), scanner.nextInt(),scanner.nextInt(),scanner.nextDouble());
            System.out.println(car1);
            System.out.println(car2);
        } catch (InvalidCarParametersException e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e) {
            System.err.println("Въведи като хората");
        }
    }
}