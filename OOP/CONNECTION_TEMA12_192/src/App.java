import java.sql.SQLException;
import java.util.Scanner;

public class App {
    public static String brand;
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter brand: ");
        brand = scanner.nextLine();
        DBAccess.getConnection(brand);
    }
}
