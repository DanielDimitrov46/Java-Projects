import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfData = scanner.nextLine();
        switch (typeOfData) {
            case "String":
                String text = scanner.nextLine();
                System.out.println(text + "*");
                break;
            case "int":
                int intNumber = scanner.nextInt();
                System.out.println(intNumber + 1);
                break;
            case "double":
                double doubleNumber = scanner.nextDouble();
                System.out.println(doubleNumber + 1);
                break;
            default:
                System.out.println("Wrong type of data!");
                break;
        }
    }
}
