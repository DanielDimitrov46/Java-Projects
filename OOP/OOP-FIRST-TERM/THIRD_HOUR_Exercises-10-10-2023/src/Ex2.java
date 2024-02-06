import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double points = scanner.nextDouble();
        double startingPoints = points;
        if (points > 1 && points <= 3) {
            points *= 10;
        } else if (points >= 4 && points <= 6) {
            points *= 100;
        } else if (points >= 7 && points <= 9) {
            points *= 1000;
        } else {
            System.out.println("Invalid result!");
        }
        if (startingPoints != 0 && startingPoints <= 9 && startingPoints > 0) {
            System.out.println(points);
        }
    }
}
